class Base{
    Base(){
        System.out.println("I am an Constructor");
    }
    Base(int a){
        System.out.println("I am an overloaded contructor"+a);
    }
}
class Derived extends Base{
    Derived(){
       // super(0);
        System.out.println("I am an constructor of derived class");
    }
    Derived(int a , int b){
        System.out.println("I am an overloaded constructor :"+b);
    }
}
public class conover_in_2 {
    public static void main(String[]args){
        //Base b = new Base();
        Derived d = new Derived();
    }
    
}
