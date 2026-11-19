
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 8);

        System.out.println("Final string: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Reverse: " + sb.reverse());
    }
}
