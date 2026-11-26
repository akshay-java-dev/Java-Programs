
class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>();
        b1.setValue(100);

        Box<String> b2 = new Box<>();
        b2.setValue("Hello Java");

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
    }
}
