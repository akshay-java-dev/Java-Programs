class Employee {
    private String name;
    private int id;

    public Employee() {
       name = "Akshay";
        id = 38;

    }

    public Employee(String myname , int myid) {
        name = myname;
        id = myid;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int x) {
        this.id = x;
    }

}

public class constructor_1 {
    public static void main(String[] args) {
       // Employee e = new Employee("Akshay",38);
        Employee e = new Employee();
        System.out.println(e.getName());
        System.out.println(e.getId());

    }
}
