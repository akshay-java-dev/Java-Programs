
interface Data<T> {

    void display(T value);
}

class StringData implements Data<String> {

    public void display(String value) {
        System.out.println("String: " + value);
    }
}

class IntegerData implements Data<Integer> {

    public void display(Integer value) {
        System.out.println("Integer: " + value);
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {

        StringData s = new StringData();
        IntegerData i = new IntegerData();

        s.display("Java Developer");
        i.display(100);
    }
}
