interface Vehicle {

    void start();

    default void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

public class InterfaceWithDefaultMethod
        implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    public static void main(String[] args) {

        InterfaceWithDefaultMethod car =
                new InterfaceWithDefaultMethod();

        car.start();
        car.fuelType();
    }
}
