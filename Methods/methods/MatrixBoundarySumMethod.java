public class MatrixBoundarySumMethod {

    static int boundarySum(int[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 ||
                    j == 0 || j == cols - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(boundarySum(matrix));
    }
}
