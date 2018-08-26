package form_template_method;

import java.util.Enumeration;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public abstract class BaseStatement {
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

    protected abstract String getHeadString(Customer customer);
    protected abstract String getRentals(Rental rental);
    protected abstract String getFootString(Customer customer);
}
