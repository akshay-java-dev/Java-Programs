
class NumberBox<T extends Number> {

    private T number;

    NumberBox(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}

public class BoundedGenericExample {
    public static void main(String[] args) {

        NumberBox<Integer> n1 = new NumberBox<>(5);

        NumberBox<Double> n2 = new NumberBox<>(4.5);

        System.out.println("Square: " + n1.square());
        System.out.println("Square: " + n2.square());
    }
}
