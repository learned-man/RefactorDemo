package rentalstore.statement;

import rentalstore.model.Customer;
import rentalstore.model.Rental;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Statement extends BaseStatement {

    @Override
    public String getHeaderString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String getRental(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }

    @Override
    public String getFooterString(double totalAmount, double frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalAmount) + "\n"
                + "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    }

}
