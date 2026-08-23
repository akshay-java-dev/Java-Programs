/*Comparison of String
1. == Method = comparator
check if reference variables are pointing to some variables */


import java.util.*;
public class Comparison {
    public static void main(String[]args){
        String a = "Akshay";
        String b = "Akshay";
    //    System.out.println(a ==b);

    String name1 = new String("Akshay");
    String name2 = new String("Akshay");
    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));
    }
}
