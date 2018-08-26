package remove_switch;

public class Employee {
    private int type;
    protected int monthlySalary;
    protected int commission;
    protected int bonus;

    public Employee() {
    }

    public Employee(int type) {
        this.type = type;
    }

    int payAmount() throws Exception{
        return Factory.getEmployee(type).payAmount();
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
