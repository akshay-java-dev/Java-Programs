
public class AutoboxingExample {
    public static void main(String[] args) {

        int a = 50;
        double b = 45.5;
        char c = 'J';

        Integer num = a;
        Double value = b;
        Character letter = c;

        System.out.println("Integer object: " + num);
        System.out.println("Double object: " + value);
        System.out.println("Character object: " + letter);
    }
}
