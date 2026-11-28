
public class UnboxingExample {
    public static void main(String[] args) {

        Integer a = 100;
        Double b = 55.5;
        Character c = 'A';

        int num = a;
        double value = b;
        char letter = c;

        System.out.println("Primitive int: " + num);
        System.out.println("Primitive double: " + value);
        System.out.println("Primitive char: " + letter);
    }
}
