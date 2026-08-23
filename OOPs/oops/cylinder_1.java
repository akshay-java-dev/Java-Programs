class Cylinder {
    int radius;
    int height;
    float p = 3.14f;

    public float getArea() {
        return 2 * p * radius * height + 2 * p * radius * radius; // TSA
    }

    public float getVolume() {
        return p * radius * radius * height; // Correct formula
    }
}

class Cylinder_1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 7; // assign directly
        c.radius = 4;
        System.out.println("Surface Area = " + c.getArea());
        System.out.println("Volume = " + c.getVolume());
    }
}
