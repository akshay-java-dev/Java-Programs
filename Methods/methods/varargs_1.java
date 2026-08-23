public class varargs_1 {
    /*static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a , int b , int c){
        return a + b + c;
    }*/

    static int sum(int ...arr){
        // available as int[]arr;
        int result = 0;
        for (int a : arr) {
            result += a;
            
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs");
        System.out.println("sum two these two number is :-" + sum(4, 9));
        System.out.println("sum three these two number is :-" + sum(4, 9,5));
    }

}
