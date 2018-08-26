package remove_switch;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Manager extends Employee{

    Employee employee;

    public Manager(Employee employee){
        this.employee=employee;
    }

    int payAmount(){
        return employee.getMonthlySalary() + employee.getBonus();
    }
}
