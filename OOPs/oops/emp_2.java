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

    public void setSalary(int a){
        salary = a;
    }
}
public class emp_2 {
    public static void main(String[]args){
        Employee emp = new Employee();
        emp.setName("Akshay Kumbhar");
        emp.setSalary(70000);
        System.out.println("Emp Name :-" +emp.getName());
        System.out.println("Emp Salary:-" +emp.getSalary());

        // after updating 
        System.out.println("After updating emp data");
        emp.setName("athrav maske");
        emp.setSalary(1000000);
        System.out.println("updating name :-" +emp.getName());
        System.out.println("updating salary :-"+emp.getSalary());

    }
    
}
