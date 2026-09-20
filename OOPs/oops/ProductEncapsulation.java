public class ProductEncapsulation {

    private String productName;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0");
        }
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        ProductEncapsulation product =
                new ProductEncapsulation();

        product.setProductName("Laptop");
        product.setPrice(55000);

        System.out.println("Product: "
                + product.getProductName());

        System.out.println("Price: "
                + product.getPrice());
    }
}
