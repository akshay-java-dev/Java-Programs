class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setSalary(int n){
        salary = n;
    }
}
public class emp_1{
    public static void main(String[]args){
        Employee akshay = new Employee();
        akshay.setName("Akshay Kumbhar");
        System.out.println(akshay.getName());

        Employee akshay1 = new Employee();
        akshay1.setSalary(70000);
        System.out.println(akshay1.getSalary());

    }
}