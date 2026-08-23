class phone{
    void showTime(){
        System.out.println("Showing the Time...");
    }
    void On(){
        System.out.println(" The mobile is Turning on...");
    }
}
class smartphone extends phone{
    void music(){
        System.out.println("Playing a music");
    }
    void On(){
        System.out.println("The smartphone is turning on..");
    }
    void showTime(){
        System.out.println(" The SmartPhone is showing the Time..");
    }
}
public class dynamicdispath_2 {
    public static void main(String[]args){
        phone obj = new smartphone();
        //obj.music(); // not allowed
        obj.On();
        obj.showTime();
    }
    
}
