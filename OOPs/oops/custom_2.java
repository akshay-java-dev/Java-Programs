class Employee{
    int id;
    String name;

    public void printdetails(){
        System.out.println("Employee id:-"+id);
        System.out.println("Employee name:-"+name);
    }
}
public class custom_2 {
    public static void main(String[]args){
        Employee e =new Employee();
        e.name = "Akshay";
        e.id = 38;
        e.printdetails();
    }
    
}
