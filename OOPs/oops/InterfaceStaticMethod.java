interface Calculator {

    int add(int a, int b);

    static void message() {
        System.out.println("This is a static interface method");
    }
}

public class InterfaceStaticMethod implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        InterfaceStaticMethod obj =
                new InterfaceStaticMethod();

        System.out.println("Sum = " + obj.add(10, 20));

        Calculator.message();
    }
}
