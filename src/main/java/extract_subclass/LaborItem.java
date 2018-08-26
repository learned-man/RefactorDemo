package extract_subclass;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class LaborItem extends JobItem{
    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        this.quantity=quantity;
        this.employee=employee;
    }

    public int getUnitPrice() {
        return  employee.getRate();
    }
}
