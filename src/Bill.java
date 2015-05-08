/**
 * Created by idnsmu on 5/7/2015.
 */
public class Bill {
    private int quantity;
    private double price;

    public Bill(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass().getCanonicalName() != other.getClass().getCanonicalName()) {
            return false;
        }
        Bill otherBill = (Bill) other;
        return this.quantity == otherBill.quantity && this.price == otherBill.price;
    }

}
