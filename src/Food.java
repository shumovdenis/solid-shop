public class Food extends Product implements Delivery{
    public Food(String name, int price) {
        super(name, price);
    }

    @Override
    public void delivery() {
        System.out.println(getName() + " - передан в службу доставки");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
