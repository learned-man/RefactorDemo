package rentalstore.strategy;

import rentalstore.model.Rental;
import rentalstore.movie.Movie;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class NewReleasePrice extends Price {


    @Override
    public double getAmount(Rental each) {
        return each.getDayRented() * 3;
    }

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
