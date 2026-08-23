import java.util.Scanner;

class square_1 {
    public static void main(String[] args) {
        Square_2 s = new Square_2(); // input taken here
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}

class Square_2 {
    int size;

    // Constructor to take input
    public Square_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of size:");
        size = sc.nextInt();
    }

    public int area() {
        return size * size;
    }

    public int perimeter() {
        return 4 * size;
    }
}
