import java.util.*;
public class Casecheck {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }else{
             System.out.println("Not Alphabet");
        }
       
    }
}
