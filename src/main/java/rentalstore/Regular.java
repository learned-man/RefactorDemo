package rentalstore;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Regular extends Movie{

    public Regular(){

    }

    @Override
    public double getAmount(Rental each) {
        double amount = 2;
        if (each.getDayRented() > 2) {
            amount += (each.getDayRented() - 2) * 1.5;
        }
        return amount;
    }

}
