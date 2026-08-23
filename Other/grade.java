public class grade{
    public static void main(String[]args){
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);


        // decryoting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}