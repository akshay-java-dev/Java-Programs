class A{
    public int akshay(){
        return 4;
    }
    public void meth1(){
        System.out.println("I am an method 1");
    }
}
class B extends A{
    public void meth1(int x){
        System.out.println(" i am an method of 1 of class b");
    }
    public void meth1(){
        System.out.println("i am an method 1 class b");
    }
    public void meth2(){
        System.out.println("I am a method 2");
    }
}
public class methodoverloading_2 {
    public static void main(String[]args){
        A a = new A();
        a.meth1();
    }
    
}
