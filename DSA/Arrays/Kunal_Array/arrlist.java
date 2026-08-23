import java.util.ArrayList;
import java.util.Scanner;
public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Enter the Arraylist Number");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 5; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));// index passing
        }
    }
    
}
