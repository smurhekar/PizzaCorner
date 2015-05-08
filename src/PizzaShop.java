import java.util.List;

/**
 * Created by idnsmu on 5/7/2015.
 */
public class PizzaShop {

    public Bill order(int quantity, Pizza pizza, Base base, Crust crust, List<Topping> toppings) throws Exception {
        if(toppings.size() > 3)
            throw new Exception();

        Bill bill = generateBill(quantity, pizza, base, crust, toppings);
        return bill;
    }

    private Bill generateBill(int quantity, Pizza pizza, Base base, Crust crust, List<Topping> toppings) {
        double total = quantity * pizza.getPrice() + base.getCost() + crust.getCost();
        for (Topping topping : toppings){
            total += topping.getCost();
        }
        return new Bill(quantity, total);
    }
}
