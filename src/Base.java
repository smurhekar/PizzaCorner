/**
 * Created by idnsmu on 5/7/2015.
 */
public enum Base {
    NORMAL(0),
    WHEAT(1);
    private final double cost;

    Base(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
