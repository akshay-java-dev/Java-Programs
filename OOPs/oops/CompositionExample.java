class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

public class CompositionExample {

    private Engine engine;

    CompositionExample() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car starts");
    }

    public static void main(String[] args) {

        CompositionExample car =
                new CompositionExample();

        car.startCar();
    }
}
