package remove_switch;

public class Employee {
    private int type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee() {
    }

    public Employee(int type) {
        this.type = type;
    }

    int payAmount(){
        return ProxyFactory.getEmployeeProxy(type,this).payAmount();
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

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
