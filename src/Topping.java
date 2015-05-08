/**
 * Created by idnsmu on 5/7/2015.
 */
public enum Topping {
    BLACK_OLIVES(0.5),
    CRISP_CAPSICUM(0.5),
    MUSHROOM(0.5),
    GOLDEN_CORN(0.5),
    PINEAPPLE(0.6),
    FRESH_TOMATO(0.6),
    JALAPENO(0.75),
    RED_PEPPER(0.75),
    GHERKINS_BABYCORN(0.75);

    private final double cost;

    Topping(double cost) {
        this.cost = cost;
    }


    public double getCost() {
        return cost;
    }
}
