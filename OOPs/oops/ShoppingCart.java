import java.util.ArrayList;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<Item> cart = new ArrayList<>();

        cart.add(new Item("Laptop", 55000));
        cart.add(new Item("Mouse", 800));
        cart.add(new Item("Keyboard", 1500));

        double total = 0;

        for (Item item : cart) {
            System.out.println(item.name + " - ₹" + item.price);
            total += item.price;
        }

        System.out.println("Total = ₹" + total);
    }
}
