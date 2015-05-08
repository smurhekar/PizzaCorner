/**
 * Created by idnsmu on 5/7/2015.
 */
public enum Crust {
    THIN(0.5),
    THICK(0),
    PAN(-0.75);
    private final double cost;

    Crust(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
