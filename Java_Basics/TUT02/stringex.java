import java.util.Scanner;
public class stringex {
    public static void main(String[]args){
   // String message = greet();
    //System.out.println(message);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name :-");
    String name  = sc.next();
    String mygreeting = mygreet(name);
    System.out.println("MyGreeting is :-" +mygreeting);
    }
    static String mygreet ( String name){
        String message = "Hello  " + name;
        return message;
    }
    static String greet(){
        String greeting = "How are u";
        return greeting;

    }
}
