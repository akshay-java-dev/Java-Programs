public class fibonacci_3 {
    static int fibo(int n){
        if(n==1){
            return 0;
        }else if(n==2){ // as we know we can also write if (n==1 || n==2); return n-1;
            return 1;
        } else{
            return fibo(n-1) + fibo(n-2);
        }     
        }
        public static void main(String[]args){
            int result = fibo(10);
            System.out.println(result);
        }
    }
    

