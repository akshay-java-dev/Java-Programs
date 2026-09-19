interface Vehicle {

    void start();

    default void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

public class DefaultMethodOverriding implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void fuelType() {
        System.out.println("Car uses petrol");
    }

    public static void main(String[] args) {

        DefaultMethodOverriding car =
                new DefaultMethodOverriding();

        car.start();
        car.fuelType();
    }
}
