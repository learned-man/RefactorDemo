package rentalstore.strategy;

import rentalstore.model.Rental;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public abstract class MovieStrategy {
    public abstract int getPriceCode();

    public abstract double getAmount(Rental each);
}
