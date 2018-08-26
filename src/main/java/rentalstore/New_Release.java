package rentalstore;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class New_Release extends Movie {

    public New_Release() {

    }

    @Override
    public double getAmount(Rental each) {
        return each.getDayRented() * 3;
    }
}
