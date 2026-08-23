import java.util.Scanner;
public class do_while_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
    
}
