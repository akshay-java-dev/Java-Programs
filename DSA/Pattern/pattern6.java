public class pattern6 {
    public static void main(String[] args) {
        Noboth(5);
    }
    static  void Noboth(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
