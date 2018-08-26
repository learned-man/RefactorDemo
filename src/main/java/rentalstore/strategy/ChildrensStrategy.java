package rentalstore.strategy;

import rentalstore.model.Rental;
import rentalstore.movie.Movie;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class ChildrensStrategy extends MovieStrategy {


    @Override
    public double getAmount(Rental each) {
        double amount = 1.5;
        if (each.getDayRented() > 3) {
            amount += (each.getDayRented() - 3) * 1.5;
        }
        return amount;
    }

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
