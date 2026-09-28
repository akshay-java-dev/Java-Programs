import java.util.HashSet;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class HashSetObjects {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Akshay");
        employees.add("Rahul");
        employees.add("Akshay");

        for (String name : employees) {
            System.out.println(name);
        }
    }
}
