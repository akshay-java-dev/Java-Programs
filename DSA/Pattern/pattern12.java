public class pattern12 {
    public static void main(String[]args){
        Dia(5);
    }
    static void Dia(int n){
        for(int row = 1; row <= 2 * n; row ++){
            int totalcol = row > n ? 2 * n - row : row;
            for(int s = 0; s < n - totalcol; s++){
                System.out.print(" ");
            }
            for(int col = totalcol; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= totalcol; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
