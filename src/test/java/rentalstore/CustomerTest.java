package rentalstore;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rentalstore.model.Customer;
import rentalstore.model.Rental;
import rentalstore.movie.Movie;

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
        Rental childRental=new Rental(new Movie("猫和老鼠",Movie.CHILDRENS),3);
        Rental newRental=new Rental(new Movie("新电影",Movie.NEW_RELEASE),3);
        Rental regularRental2=new Rental(new Movie("普通电影",Movie.REGULAR),3);
        customer.addRental(childRental);
        customer.addRental(newRental);
        customer.addRental(regularRental2);
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
