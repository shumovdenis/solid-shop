public class Product implements Delivery{
    private String name;
    private double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void delivery() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Наименование " + name +
                ", цена " + price;
    }
}
