public class StaticNestedClass {

    static String company = "Tech Solutions";

    static class Employee {

        void display() {
            System.out.println("Company: " + company);
        }
    }

    public static void main(String[] args) {

        StaticNestedClass.Employee employee =
                new StaticNestedClass.Employee();

        employee.display();
    }
}
