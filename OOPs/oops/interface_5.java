class monkey{
    void jump(){
        System.out.println("The Monkey is Jumping on tree");
    }
    void Bite(){
        System.out.println("The Monkey Is Biting");
    }
}
interface animal{
    void eat();
    void sleep();
}
class human extends monkey implements animal{
    void speak(){
        System.out.println("Speaking.....");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class interface_5 {
    public static void main(String[] args) {
       monkey m = new monkey();
       m.jump();
       m.Bite();
       
       human h = new human();
       h.eat();
       h.sleep();
       h.speak();
    }
}
