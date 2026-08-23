class rectangle {
    public int l;
    public int b;

    rectangle(int l , int b) {
        this.l = l;
        this.b = b;
    }

    public int area() {
        return l * b;
    }
}

class cuboid extends rectangle {
    public int h;

    cuboid(int l , int b, int h) {
        super(l, b);
        this.h = h;
    }

    // Correct Total Surface Area (TSA) formula: 2(lb + bh + hl)
    public int area() {
        return 2 * (l*b + b*h + h*l);
    }

    public int volume() {
        return l * b * h;
    }
}

public class prob_2 {
    public static void main(String[] args) {
        rectangle r = new rectangle(2, 5);
        System.out.println("Rectangle Area: " + r.area());

        cuboid c = new cuboid(2, 4, 5);
        System.out.println("Cuboid Surface Area: " + c.area());
        System.out.println("Cuboid Volume: " + c.volume());
    }
}
