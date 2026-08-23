import java.util.Scanner;
public class miles{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Kikometers");
        float kg = sc.nextFloat();
        double miles = kg*0.621371;
        System.out.println("Miles:-"+miles);
    }
}