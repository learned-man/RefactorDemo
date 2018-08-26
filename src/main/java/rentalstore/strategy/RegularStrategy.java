package rentalstore.strategy;

import rentalstore.model.Rental;
import rentalstore.movie.Movie;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class RegularStrategy extends MovieStrategy {

    @Override
    public double getAmount(Rental each) {
        double amount = 2;
        if (each.getDayRented() > 2) {
            amount += (each.getDayRented() - 2) * 1.5;
        }
        return amount;
    }

    @Override
    public double getFrequentRenterPointsStep() {
        return 1;
    }

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
