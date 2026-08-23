public class recursive_2 {
    static int sumRect(int n){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }
    public static void main(String[]args){
        int c = sumRect(3);
        System.out.println(c);
    }
    
}
