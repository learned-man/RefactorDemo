package rentalstore.movie;

import rentalstore.strategy.*;

public  class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int LITERARY = 3;

    private String title;
    private MovieStrategy price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public MovieStrategy getPrice() {
        return price;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularStrategy();
                break;
            case CHILDRENS:
                price = new ChildrensStrategy();
                break;
            case NEW_RELEASE:
                price = new NewReleaseStrategy();
                break;
            case LITERARY:
                price = new LiteraryStrategy();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return title;
    }

}
