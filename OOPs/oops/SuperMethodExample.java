class Vehicle {

    void display() {
        System.out.println("This is a vehicle");
    }
}

public class SuperMethodExample extends Vehicle {

    @Override
    void display() {

        super.display();

        System.out.println("This is a car");
    }

    public static void main(String[] args) {

        SuperMethodExample car =
                new SuperMethodExample();

        car.display();
    }
}
