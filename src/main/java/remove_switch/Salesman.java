package remove_switch;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Salesman extends Employee{

    Employee employee;

    public Salesman(Employee employee){
        this.employee=employee;
    }

    int payAmount(){
        return employee.getMonthlySalary() + employee.getCommission();
    }
}
