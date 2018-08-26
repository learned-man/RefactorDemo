package rentalstore.statement;

import rentalstore.model.Customer;
import rentalstore.model.Rental;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class HtmlStatement extends BaseStatement {

    @Override
    public String getHeaderString(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    public String getRental(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "<BR>\n";
    }

    @Override
    public String getFooterString(double totalAmount, int frequentRenterPoints) {
        return "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>\n"
                + "On this rental You earned<EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
    }
}
