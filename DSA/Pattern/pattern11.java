public class pattern11 {
    public static void main(String[] args) {
        numbers(5);
    }
    static void numbers(int n ){
        for(int row = 1; row <= n; row++){
            for(int s = 0; s < n-row; s++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
                for(int col = 2; col <= row; col++){
                    System.out.print(col);
                }
                System.out.println();
            
        }
    }
}
