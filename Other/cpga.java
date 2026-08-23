import java.util.Scanner;
public class cpga{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int total = 3;
        System.out.println("Enter the marks of computer");
        double computer = sc.nextInt();
        System.out.println("Enter the marks of java");
        double java = sc.nextInt();
        System.out.println("Enter the marks of python");
        double python = sc.nextInt();

        double Obtaintedmarks = (computer+java+python) / 10.0 ;
        double cgpa = Obtaintedmarks /total;
        System.out.println("cgpa");
        System.out.println(cgpa);
    }
}