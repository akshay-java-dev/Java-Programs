interface Company {

    String COMPANY_NAME = "Tech Solutions";
    int EMPLOYEE_COUNT = 100;
}

public class InterfaceConstant implements Company {

    void display() {

        System.out.println("Company = " + COMPANY_NAME);
        System.out.println("Employees = " + EMPLOYEE_COUNT);
    }

    public static void main(String[] args) {

        InterfaceConstant obj =
                new InterfaceConstant();

        obj.display();
    }
}
