package form_template_method;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class HtmlStatement {

    public String getValue(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeadString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getRentals(each);
        }
        //add footer lines
        result += getFootString(customer);
        return result;
    }

    public String getHeadString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    public String getRentals(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String getFootString(Customer customer) {
        return "<P>You owe<EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n"
                + "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}
