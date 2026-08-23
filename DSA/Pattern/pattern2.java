public class pattern2{
    public static void main(String[]args){
        rec(4);
    }
    static void rec(int n){
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}