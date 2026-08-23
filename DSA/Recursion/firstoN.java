public class firstoN {
    public static void main(String[] args) {
        Funrev(6);
    }
    static void Funrev(int n){
        if(n == 0){
            return;
        }
        Funrev( n - 1);
        System.out.println(n);
    }
}
