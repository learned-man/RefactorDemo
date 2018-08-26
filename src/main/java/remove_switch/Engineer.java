package remove_switch;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Engineer extends Employee{

    private Employee employee;

    public Engineer(Employee employee){
        this.employee=employee;
    }

    int payAmount(){
        return employee.getMonthlySalary();
    }
}
