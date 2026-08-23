import java.util.Scanner;
public class pf_1 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of maths");
    byte m = sc.nextByte();
    System.out.println("Enter the marks of science");
    byte s = sc.nextByte();
    System.out.println("Enter the marks of Bio");
    byte b = sc.nextByte();

    float avg = m+s+b/3.0f;
    System.out.println("you over percentage is " +avg);
    if(avg >= 40 && m>33 && s>33 && b>33){
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }
    
}
}