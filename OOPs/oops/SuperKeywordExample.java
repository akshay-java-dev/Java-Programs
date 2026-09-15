class Parent {

    int number = 100;

    void display() {
        System.out.println("Parent method");
    }
}

public class SuperKeywordExample extends Parent {

    int number = 200;

    void show() {

        System.out.println("Child number = " + number);
        System.out.println("Parent number = " + super.number);

        super.display();
    }

    public static void main(String[] args) {

        SuperKeywordExample obj =
                new SuperKeywordExample();

        obj.show();
    }
}
