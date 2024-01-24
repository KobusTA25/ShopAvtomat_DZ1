import java.util.List;

class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> productList;
    private int price;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                price += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public void addHotDrink(HotDrink hotDrink) {
        productList.add(hotDrink);
    }

    public void printAvailableDrinks() {
        System.out.println("Доступные напитки в автомате:");
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }

    public int getPrice() {
        return price;
    }

    public void resetPrice() {
        price = 0;
    }

    public void Product() {
        Product product = getProduct("Coffee");
        if (product != null) {
            System.out.println("Продукт получен: " + product.getName() + " объемом " + product.getVolume() + " мл" +
                    ", температурой " + ((HotDrink) product).getTemperature());
            System.out.println("Сумма денег в автомате: " + getPrice());
        } else {
            System.out.println("Такого напитка нет в автомате");
        }
    }
}