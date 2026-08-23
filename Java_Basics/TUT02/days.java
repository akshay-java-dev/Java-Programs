import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter The Valid Option");
        int days = sc.nextInt();

       /*  switch(days){
            case 1 :
            System.out.println("Monday");
            break;

            case 2 :
                System.out.println("Tuseday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;
             
            case 4 :
                System.out.println("Thursday");
                break;
                
            case 5 :
                System.out.println("Friday");
                break;
                
            case 6 :
                System.out.println("Saturday");
                break;
                
            case 7 :
                System.out.println("Sunday");
                break;
                
            default :
                System.out.println("Invalid option");    

        }
 */      

        switch(days){
            case 1 , 2 , 3 , 4 , 5 :
                System.out.println(" week days");
                break;

            case 6 , 7 :
                System.out.println(" Weekend ");
                break;
                
            default :
            System.out.println("Invalid Option");    
        }
    }
}
