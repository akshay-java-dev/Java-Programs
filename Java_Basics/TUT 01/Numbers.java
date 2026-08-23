
import java.util.Scanner;

/*public class Numbers {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
}
    */
public class Numbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number how many you want from firt");
        int num = sc.nextInt();

        for(int i = 1; i<= num; i++){
            System.out.println(i);
        }
    }

}
