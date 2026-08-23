interface Bicycle{
    int a = 34;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
 interface House{
    void BlowLight(int increment);
    void closeDoor(int decrement);
 }
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee");
    }
    public void applyBrakes(int decrement){
        System.out.println("Applying the Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Speedup");
    }
}
class Evcycle extends AvonCycle implements Bicycle{
    void open(){
        System.out.println(" Open the Door");
    }
    public void BlowLight(int increment){
        System.out.println("Blowing the Light");
    }
    public void closeDoor(int decrement){
        System.out.println("Closing the Door");
    }
}
public class interface_1 {
    public static void main(String[] args) {
        AvonCycle  c = new AvonCycle();
        c.applyBrakes(2);
        Evcycle e = new Evcycle();
        e.closeDoor(1);
    
}
}
