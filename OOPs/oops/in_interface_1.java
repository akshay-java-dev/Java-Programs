interface sample{
    void meth1();
    void meth2();
}
interface chidsample extends sample{
    void meth3();
    void meth4();
}
class demo implements chidsample{
    public void meth1(){
        System.out.println(" Its method one..");
    }
    public void meth2(){
        System.out.println("Its a method two..");
    }
    public void meth3(){
        System.out.println("Its a method three");
    }
    public void meth4(){
        System.out.println("Its a method four");
    }
}
public class in_interface_1 {
    public static void main(String[] args) {
        demo d = new demo();
        d.meth1();
        d.meth2();
    }
    
}
