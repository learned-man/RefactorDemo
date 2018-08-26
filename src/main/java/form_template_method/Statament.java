package form_template_method;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Statament {

    public String getValue(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeadString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getRentals(each);
        }
        //add footer lines
        result += getFootString(customer);
        return result;
    }

    public String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public String getRentals(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String getFootString(Customer customer){
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
                + "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }

}
