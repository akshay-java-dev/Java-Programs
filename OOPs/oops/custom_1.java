class Employee {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int x) {
        id = x;
    }
}

public class custom_1 {
    public static void main(String[] args) {
        System.out.println("This is an Custom class");
        Employee e = new Employee();
        e.setId(38);
        e.setName("Kumbhar");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }

}
