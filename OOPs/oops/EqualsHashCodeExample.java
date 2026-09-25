class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;

        return this.id == other.id
                && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {

        return 31 * id + name.hashCode();
    }
}

public class EqualsHashCodeExample {

    public static void main(String[] args) {

        Employee e1 =
                new Employee(101, "Akshay");

        Employee e2 =
                new Employee(101, "Akshay");

        System.out.println("Equals: " + e1.equals(e2));
        System.out.println("Hash 1: " + e1.hashCode());
        System.out.println("Hash 2: " + e2.hashCode());
    }
}
