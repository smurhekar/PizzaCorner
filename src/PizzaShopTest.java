import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class PizzaShopTest {

    @Test
    public void shouldBeAbleToBuyNormalPizza() throws Exception {
        PizzaShop shop = new PizzaShop();
        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.NORMAL, Crust.THICK, new ArrayList<Topping>());
        assertEquals(new Bill(1, 5), actualBill);
    }

    @Test
    public void shouldBeAbleToBuyWheatPizza() throws Exception {
        PizzaShop shop = new PizzaShop();
        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.WHEAT, Crust.THICK, new ArrayList<Topping>());
        assertEquals(new Bill(1, 6), actualBill);
    }

    @Test
    public void shouldBeAbleToBuyThinCrustWheatPizza() throws Exception {
        PizzaShop shop = new PizzaShop();
        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.WHEAT, Crust.THIN, new ArrayList<Topping>());
        assertEquals(new Bill(1, 6.5), actualBill);
    }

    @Test
    public void shouldBeAbleToBuyPanCrustWheatPizza() throws Exception {
        PizzaShop shop = new PizzaShop();
        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.WHEAT, Crust.PAN, new ArrayList<Topping>());
        assertEquals(new Bill(1, 5.25), actualBill);
    }

    @Test
    public void shouldBeAbleToBuyBaseCrustWheatPizzaWithToppings() throws Exception {
        PizzaShop shop = new PizzaShop();
        List<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.RED_PEPPER);
        toppings.add(Topping.BLACK_OLIVES);
        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.NORMAL, Crust.THICK, toppings);
        assertEquals(new Bill(1, 6.25), actualBill);
    }


    @Test(expected = Exception.class)
    public void shouldAllowOnlyMaxThreeToppings() throws Exception {
        PizzaShop shop = new PizzaShop();
        List<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.RED_PEPPER);
        toppings.add(Topping.BLACK_OLIVES);
        toppings.add(Topping.CRISP_CAPSICUM);
        toppings.add(Topping.MUSHROOM);

        Bill actualBill = shop.order(1, Pizza.AMERICAN, Base.NORMAL, Crust.THICK, toppings);
        fail("Should not have reached here");
    }
}