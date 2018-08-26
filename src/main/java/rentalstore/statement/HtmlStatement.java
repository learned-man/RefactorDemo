package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.MovieFactory;
import rentalstore.Rental;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class HtmlStatement {
    public String getResult(Customer customer) throws Exception {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customer.getRentals().elements();
        String result = "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount += MovieFactory.getMovie(each.getMovie().getPriceCode()).getAmount(each);
            //add frequent renter points
            frequentRenterPoints++;
            //add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == MovieFactory.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "<BR>\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>\n";
        result += "On this rental You earned<EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
        return result;
    }
}
