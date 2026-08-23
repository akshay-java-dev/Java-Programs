class dog{
    dog(){
        System.out.println("This is a Dog");
    }
}
class animal extends dog{
    animal(){
    System.out.println("This is an animal");
}
}
public class inheritance_2 {
    public static void main(String[]args){
        //dog d = new dog();
        animal a = new animal();
    }
    
}
