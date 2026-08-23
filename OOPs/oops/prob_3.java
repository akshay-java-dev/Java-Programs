class rectangle {
    public int l;
    public int b;

    public int getArea() {
        return l * b;
    }

    public void setDimensions(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class cuboid extends rectangle {
    public int h;

    @Override
    public int getArea() { // TSA of cuboid
        return 2 * (l*b + b*h + h*l);
    }

    public void setDimensions(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public int getVolume() {
        return l * b * h;
    }
}

public class prob_3 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setDimensions(2, 3);
        System.out.println("Rectangle Area: " + r.getArea());

        cuboid c = new cuboid();
        c.setDimensions(3, 5, 6);
        System.out.println("Cuboid Surface Area: " + c.getArea());
        System.out.println("Cuboid Volume: " + c.getVolume());
    }
}
