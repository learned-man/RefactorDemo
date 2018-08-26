package rentalstore;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class MovieFactory {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public static Movie getMovie(int priceCode) throws Exception {
        switch (priceCode) {
            case REGULAR:
                return new Regular();
            case NEW_RELEASE:
                return new New_Release();
            case CHILDRENS:
                return new Childrens();
            default:
                throw new Exception("the priceCode of movie is not exist");
        }
    }
}
