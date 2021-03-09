import java.util.HashMap;
import java.util.Map;

public class Basket implements Notification{
    private HashMap<Product, Integer> basket = new HashMap<>();
    private double  totalPrice;

    public void addProductToBasket (Store store, Product product, int amount) {
        if (store.getStore().containsKey(product) && store.getStore().get(product) >= amount) {
            basket.put(product, amount);
            store.getStore().put(product, store.getStore().get(product) - amount);
            totalPrice = totalPrice + amount * product.getPrice();
        } else {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println(msg);
    }

    public void confirmationOfAnOrder () {
        printBasket();
        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            entry.getKey().delivery();
        }

    }

    public void printBasket() {
        System.out.println("Ваша корзина");
        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            System.out.println(entry.getKey() + " количество " + entry.getValue());
        }
        if (totalPrice < 100) {
            System.out.println("Сумма вашего заказа: " + totalPrice);
            sendNotification("Закажите на сумму больше 100 рублей и получите бесплатную доставку");
        } else {
            System.out.println("Сумма вашего заказа: " + totalPrice);
            sendNotification("Доставка бесплатно");
        }
    }
}
