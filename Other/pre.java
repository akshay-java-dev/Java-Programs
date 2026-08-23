import java.util.*;
public class pre{
    
    public static void main(String[]args){
        // precedence & Associativity
        /*  Highest precedence goes to * and / .They are then evaluated on the basis of left to right
        associativity.
         */ 
        int a = 6*5-23/2;

        int b = 6/5-23*2;

        System.out.println(a);
        System.out.println(b);
        
        

    }
}