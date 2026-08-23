import java.util.Scanner;
public class pf {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Marks of maths");
        int math = sc.nextInt();

        if(math > 35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        System.out.println("Enter the marks of bio");
        int bio = sc.nextInt();

        if(bio > 40){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


        System.out.println("Enter the of science");
        int science = sc.nextInt();

        if(science > 45){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        /*if(math > 35){
            System.out.println("pass");
        }else if(bio > 40){
            System.out.println("pass");
        }else if(science > 45){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        */

        }
        

    }
    
