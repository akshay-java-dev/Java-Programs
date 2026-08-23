public class pattern1 {
    public static void main(String[]args){
        pattern(4);
    }
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            // for every row, run the col
            
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            // when one row is printed then, one new line needed
            System.out.println();
        }
    }
}
