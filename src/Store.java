import java.util.HashMap;
import java.util.Map;

public class Store implements Notification{
    private HashMap<Product, Integer> store = new HashMap<>();

    @Override
    public void sendNotification(String msg) {
        System.out.println(msg);
    }

    public void addProduct(Product product, int amount) {
        store.put(product, amount);
    }

    public HashMap<Product, Integer> getStore() {
        return store;
    }

    public void printProductsInStore() {
        System.out.println("Товары в наличии: ");
        for (Map.Entry<Product, Integer> entry : store.entrySet()) {
            System.out.println(entry.getKey() + " количество " + entry.getValue());
            if (entry.getValue() < 2 && entry.getValue() != 0) {
                sendNotification("Товар " + entry.getKey().getName() + " скоро закончится" );
            }
        }
    }
}
