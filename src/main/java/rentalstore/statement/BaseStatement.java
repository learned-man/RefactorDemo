package rentalstore.statement;

import rentalstore.model.Customer;
import rentalstore.model.Rental;
import rentalstore.movie.Movie;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public abstract class BaseStatement {
    public String getResult(Customer customer) throws Exception {
        double totalAmount = 0;
        double frequentRenterPoints = 0;
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeaderString(customer);
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount += each.getMovie().getPrice().getAmount(each);
            //add frequent renter points
            frequentRenterPoints+=each.getMovie().getPrice().getFrequentRenterPointsStep();
            //add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints+=each.getMovie().getPrice().getFrequentRenterPointsStep();
            }

            //show figures for this rental
            result += getRental(each, thisAmount);
            totalAmount += thisAmount;
        }
        //add footer lines
        result += getFooterString(totalAmount,frequentRenterPoints);
        return result;
    }

    public abstract String getHeaderString(Customer customer);
    public abstract String getRental(Rental each, double thisAmount);
    public abstract String getFooterString(double totalAmount, double frequentRenterPoints);

}
