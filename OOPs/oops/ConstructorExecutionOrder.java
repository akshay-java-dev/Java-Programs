class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }
}

public class ConstructorExecutionOrder extends Parent {

    ConstructorExecutionOrder() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        ConstructorExecutionOrder obj =
                new ConstructorExecutionOrder();
    }
}
