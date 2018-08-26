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
        Assert.assertNotNull(customer.statement());
    }
}
