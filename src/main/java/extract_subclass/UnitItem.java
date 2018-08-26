package extract_subclass;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class UnitItem extends JobItem{
    private int unitPrice;

    public UnitItem(int unitPrice, int quantity) {
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public int getUnitPrice() {
        return  unitPrice;
    }
}
