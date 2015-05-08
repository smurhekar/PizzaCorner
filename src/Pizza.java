/**
 * Created by idnsmu on 5/7/2015.
 */
public enum Pizza {
    AMERICAN(5),
    INDIAN(4),
    MEXICAN(6);
    private final double price;

    Pizza(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
