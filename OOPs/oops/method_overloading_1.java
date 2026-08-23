class A{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println(" I am an Methond 2");
    }
}
class B extends A{

     public void meth2(int x){
        System.out.println(" I am an Methond 2");
    }
     public void meth2(){
        System.out.println(" I am an Methond 2");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class method_overloading_1 {
    public static void main(String[]args){
        A a = new A();
        a.meth2();
        B b= new B();
        b.meth2();
    }   
}
