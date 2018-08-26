package rentalstore;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rentalstore.model.Customer;
import rentalstore.model.Rental;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class CustomerTest {
    private static Customer customer;

    @BeforeClass
    public static void init(){
        customer=new Customer("Knight");
       // Rental rental=new Rental(new )
    }


    @Test
    public void shoule_return_result_when_Customer_getStatement() {
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
