public class method_1 {
    int mysum(int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[]args){
       int num1 = 2;
       int num2 = 2;
       method_1 a = new method_1();
       int result = a.mysum(num1,num2);
       System.out.println(result);

    }
    
}
