public class NumberRecursion {
    public static void main(String[]args){
        print(1);
    }
    static void print(int n){
        // Base Condition
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // Recursive Call
        // if you are calling a fuction again and again,you can treat it as a separate call in the stack
        System.out.print(n + 1);
    }
}
