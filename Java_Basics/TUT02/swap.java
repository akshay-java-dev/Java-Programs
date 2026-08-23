public class swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;

        // swaping the value 
       // int temp = a ;
       // a = b;
        //b= temp;
        Swap(a,b);
        System.out.println(a+ "  " +b);
    }
    static void Swap(int num1 , int num2){
        int temp = num1 ;
        num1 = num2;
        num2= temp;

    }
}
