import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        HotDrink coffee = new HotDrink("Coffee", 10, 150, 60);
        HotDrink tea = new HotDrink("Tea", 5, 250, 50);
        HotDrink cappuccino = new HotDrink("Cappuccino", 15, 70, 40);

        products.add(coffee);
        products.add(tea);
        products.add(cappuccino);

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);

        hotDrinkVendingMachine.printAvailableDrinks();
        hotDrinkVendingMachine.Product();
    }
}