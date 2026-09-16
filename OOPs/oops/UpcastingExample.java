class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class UpcastingExample {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.start();

        // vehicle.drive(); 
        // Cannot access child-specific method
        // using parent reference.
    }
}
