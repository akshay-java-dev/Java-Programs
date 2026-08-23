public class Concept{
    public static void main(String[]args){
        Fun(5);
    }
    static void Fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //Fun(n--); Only print 5 stack overflow 
        Fun(--n);
    }
}