import java.util.*;

public class Problem2FlashSaleInventory {

    static HashMap<String, Integer> inventory = new HashMap<>();

    public static boolean purchase(String product, int qty) {
        if (!inventory.containsKey(product)) return false;

        int stock = inventory.get(product);

        if (stock >= qty) {
            inventory.put(product, stock - qty);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        inventory.put("Laptop", 10);
        inventory.put("Phone", 5);

        System.out.println(purchase("Laptop", 3));
        System.out.println("Remaining Laptops: " + inventory.get("Laptop"));

        System.out.println(purchase("Phone", 6));
    }
}