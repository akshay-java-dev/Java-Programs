abstract class pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("refill");
    }

    void changeNib() {
        System.out.println("Changing the Nib");
    }
}
public class abstract_3 {
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.changeNib();
    }

}
