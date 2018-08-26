package rentalstore.strategy;

import rentalstore.model.Rental;
import rentalstore.movie.Movie;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class LiteraryStrategy extends MovieStrategy{
    @Override
    public int getPriceCode() {
        return Movie.LITERARY;
    }

    @Override
    public double getAmount(Rental each) {
        double amount=6;
        if (each.getDayRented() > 3) {
            amount += (each.getDayRented() - 3) * 3;
        }
        return amount;
    }

    @Override
    public double getFrequentRenterPointsStep() {
        return 1.5;
    }
}
