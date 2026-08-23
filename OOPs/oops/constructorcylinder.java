class Cylinder {
    private int height;
    private int radius;

    // Constructor
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Method to calculate Total Surface Area
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    // Method to calculate Volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class constructorcylinder {
    public static void main(String[] args) {
        // Create object using constructor
        Cylinder c = new Cylinder(4, 2);

        // Using getters
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());

        // Using methods
        System.out.println("Surface Area: " + c.getArea());
        System.out.println("Volume: " + c.getVolume());

        // Modify values using setters
        c.setHeight(10);
        c.setRadius(5);

        System.out.println("\nAfter using setters:");
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Surface Area: " + c.getArea());
        System.out.println("Volume: " + c.getVolume());
    }
}
