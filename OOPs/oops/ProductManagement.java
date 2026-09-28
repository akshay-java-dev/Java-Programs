import java.util.HashMap;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " ₹" + price);
    }
}

public class ProductManagement {
    public static void main(String[] args) {

        HashMap<Integer, Product> products = new HashMap<>();

        products.put(1, new Product(1, "Laptop", 55000));
        products.put(2, new Product(2, "Mouse", 800));
        products.put(3, new Product(3, "Keyboard", 1500));

        for (Product p : products.values()) {
            p.display();
        }
    }
}
