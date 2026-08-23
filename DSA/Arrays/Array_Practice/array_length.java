public class array_length {
    public static void main(String[]args){
        int [] marks = {11,55,66,77,77,33};
       /*  String[]students = {"Akshay","ayush","bhavesh"};
        System.out.println(students[1]);
        System.out.println(marks.length);
        */
        // displaying array in reverse order 
        for(int i =marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
    
}
