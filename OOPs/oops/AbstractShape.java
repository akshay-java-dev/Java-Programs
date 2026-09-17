abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("This is a shape");
    }
}

public class AbstractShape extends Shape {

    int length = 10;
    int width = 5;

    @Override
    void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area = " + area);
    }

    public static void main(String[] args) {

        AbstractShape rectangle =
                new AbstractShape();

        rectangle.display();
        rectangle.calculateArea();
    }
}
