import java.util.Arrays;
public class argsvar {
    public static void main(String[] args) {
       // fun(2,3,4,6,7,99);
       mix(2,3,"Akshay","Kumbhar");
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void mix(int a, int b,String...v){
        System.out.println(Arrays.toString(v));

    }
}
