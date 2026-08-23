public class pattern9 {
    public static void main(String[]args){
        triangle(5);
    }
    static void triangle(int n ){
        for(int row = 1; row <= n; row++){
            int Nocol = row > n ? 2 * n - row : row;
            int NoSpace = n - Nocol;
            for(int s = 0; s < NoSpace; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
