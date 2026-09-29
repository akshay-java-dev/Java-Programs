import java.util.ArrayList;

class Vehicle {
    String number;
    String type;
    double rent;

    Vehicle(String number, String type, double rent) {
        this.number = number;
        this.type = type;
        this.rent = rent;
    }

    void display() {
        System.out.println(number + " | " + type + " | ₹" + rent);
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("MH12AB1234", "Car", 1500));
        vehicles.add(new Vehicle("MH14CD5678", "Bike", 500));
        vehicles.add(new Vehicle("MH12EF9012", "SUV", 2500));

        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }
    }
}
