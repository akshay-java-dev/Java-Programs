interface mycamera{
    void takingsnap();
    void recordingvideo();
}
interface wifi{
    String [] getnetworks();
    void connectToNetwork(String network);
}
class cellphone{
    void callingNumber(int Phonenumber){
        System.out.println("Calling...."+Phonenumber);
    }
    void pickcall(){
        System.out.println("Pick the call");
    }
}
class Smartphone extends cellphone implements mycamera,wifi{
    public void takingsnap(){
        System.out.println("Taking a snap...");
    }
    public void recordingvideo(){
        System.out.println("Recoding a video..");
    }
    public String [] getnetworks(){
        System.out.println("Getting settings of networks list");
        String[] getnetworklist = {"Akshay","Kumbhar","Akshay0408"};
        return getnetworklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting.. " +network);
    }
}
public class interface_poly_1 {
    public static void main(String[] args) {
        //Smartphone c = new Smartphone(); runs the all methods 
        mycamera c = new Smartphone();
        c.takingsnap();
        wifi w = new Smartphone();
        String []arr = w.getnetworks();
        for(String item : arr){
            System.out.println(item);
        }
    }
    
}
