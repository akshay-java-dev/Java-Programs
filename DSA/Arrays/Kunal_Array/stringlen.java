import java.util.Scanner;
public class stringlen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String []str = new String[4];

        for(int i = 0; i < str.length; i++){
            System.out.println("Enter the String");
            str[i] = sc.next();
        }
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }

    }
    
}
