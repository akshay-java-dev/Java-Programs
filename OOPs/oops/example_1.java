import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int Guessnumber;
    public int   Inputnumber;
    public int getGuessnumber(){
        return Guessnumber;
    }
    public void setguessnumber(int Guessnumber){
        this.Guessnumber = Guessnumber;
    }

     game(){
        Random rand = new Random(100);
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        Inputnumber = sc.nextInt();

    }
    boolean isCorrectNumber(){
        if (Inputnumber == number){
            System.out.println(" Yes you guess is right");
            return true;
        }
        else if(Inputnumber < number){
            System.out.println("Too lesss...");
        }
        else if(Inputnumber > number){
            System.out.println("Too highh...");
        }
        return false;

    }
}
public class example_1 {
    public static void main(String[]args){
    game g = new game();
      boolean b = false;
      while(!b){
       g. takeUserInput();
       b = g.isCorrectNumber();
     System.out.println(b);
      }
    }
    
}
