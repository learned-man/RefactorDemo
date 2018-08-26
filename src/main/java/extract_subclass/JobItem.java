package extract_subclass;


public abstract class JobItem {

    protected int quantity;


    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public abstract int getUnitPrice();
}
