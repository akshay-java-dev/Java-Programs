import java.util.Scanner;

class rectangle_2 {
    int len;
    int bre;

    public rectangle_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the len");
        len = sc.nextInt();
        System.out.println("Enter the bre");
        bre = sc.nextInt();
    }

    public int rect_area() {
        return len * bre;
    }

    public int rect_pri() {
        return 2 * len + bre;
    }
}

public class rect_2 {
    public static void main(String[] args) {
        rectangle_2 r = new rectangle_2();
        System.out.println(r.rect_area());
        System.out.println(r.rect_pri());

    }

}
