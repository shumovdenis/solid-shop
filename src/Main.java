public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Basket basket = new Basket();
        Food apple = new Food("Apple" , 10);
        Food banana = new Food("Banana", 8);
        Software windows = new Software("win10", 15);


        store.addProduct(apple, 5);
        store.addProduct(banana, 8);
        store.addProduct(windows, 2);

        store.printProductsInStore();

        basket.addProductToBasket(store, apple, 5);
        basket.addProductToBasket(store, banana, 2);
        basket.addProductToBasket(store, windows,1);

        basket.printBasket();

        basket.confirmationOfAnOrder();
    }
}
