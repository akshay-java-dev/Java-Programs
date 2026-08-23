import java.util.Scanner;
public class else_if{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of person");
        int age = sc.nextInt();
        if( age > 56 ){
            System.out.println("Yes you can drive the car");
        }else if ( age > 30 ){
            System.out.println("yes you are ready for marrage");
        }else {
            System.out.println("looping is complete");

        }
    }
}