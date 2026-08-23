import java.util.Scanner;
public class tak_2d_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Colums ");
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int arr[][] = new int[rows][colums];

        System.out.println("Enter the elements of matrix");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<colums; j++){
                System.out.print("Elements["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<rows;i++){
            for(int j=0; j<colums;j++){
                System.out.print(arr[i][j]);
            }
            System.out.print(" ");
            System.out.print("\n");
        }
    }

}
