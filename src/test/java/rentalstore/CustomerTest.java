package rentalstore;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class CustomerTest {
    @Test
    public void shoule_return_result_when_Customer_getStatement() {
        Customer customer=new Customer("Knight");
        String result= null;
        try {
            result = customer.statement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    public void shoule_return_result_when_Customer_getHtmlStatement() {
        Customer customer=new Customer("Knight");
        String result= null;
        try {
            result = customer.htmlStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        Assert.assertNotNull(result);
    }
}
