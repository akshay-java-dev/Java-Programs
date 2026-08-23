interface Camera {
    void takeSnapshot();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void recording4kvideo(){
        greet();
        System.out.println("Recording..");
       }
    }


interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting.....");
    }
}

// Smartphone implements both interfaces
class Smartphone extends Cellphone implements Wifi, Camera {
    public void recording4kvideo(){
        System.out.println("Recording..");
       }
    public void takeSnapshot() {
        System.out.println("Taking Snap..");
    }
    public void recordVideo() {
        System.out.println("Recording Video..");
    }
    public String[] getNetworks() {
        System.out.println("Getting list of Networks...");
        String[] networkList = {"Akshay", "Kumbhar", "Ak0408"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to Network: " + network);
    }
}

public class interface_4 {
    public static void main(String[] args) {
        Smartphone c = new Smartphone();
        c.recording4kvideo();
        //c.greet(); rows an error because  it has private access.
        String[] ar = c.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

        // Example usage
       // c.takeSnapshot();
        //c.connectToNetwork("Ak0408");
    }
}
