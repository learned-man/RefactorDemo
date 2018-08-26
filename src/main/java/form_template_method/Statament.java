package form_template_method;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Statament extends BaseStatement {

    @Override
    public String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
    @Override
    public String getRentals(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }
    @Override
    public String getFootString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
                + "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }

}
