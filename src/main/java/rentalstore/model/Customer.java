package rentalstore.model;

import rentalstore.statement.HtmlStatement;
import rentalstore.statement.Statement;

import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public Vector getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public String statement() throws Exception {
       return new Statement().getResult(this);
    }

    public String htmlStatement() throws Exception {
        return new HtmlStatement().getResult(this);
    }


}
