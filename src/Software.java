public class Software extends Product implements Delivery{
    public Software(String name, int price) {
        super(name, price);
    }

    @Override
    public void delivery() {
        System.out.println(getName() + " - это электронный продукт вы можете его загрузить");
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
