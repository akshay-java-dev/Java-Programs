class Device {
    public void vibrating() {
        System.out.println("The Mob is Vibrating");
    }
    public void silent() {
        System.out.println("The Mob is Silent");
    }
}

public class Mobile {
    public static void main(String[] args) {
        Device d = new Device();
        d.vibrating();
        d.silent();
    }
}
