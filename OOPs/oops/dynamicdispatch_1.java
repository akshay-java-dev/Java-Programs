class one {

    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("My name is Java");
    }
}

class two extends one {

    public void welcome() {
        System.out.println("Welcome");
    }

    public void name() {
        System.out.println(" My name is java in class two");
    }
}

public class dynamicdispatch_1 {
    public static void main(String[] args) {
        // one o = new one();
        // two t = new two();
        // o.name();
        // t.welcome();
        // t.name();

        one ot = new two();// yes it is allowed
        // two ot = new one();//not allowed
  
        ot.greet();
        ot.name();

    }
}
