interface Animal{
    void eat();
    void sound();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is Eating");
    }
    public void sound(){
        System.out.println("Dog is Barking");
    }
}
class cat implements Animal{
    public void eat(){
        System.out.println(" The cating is eating");
    }
    public void sound(){
        System.out.println("meow meow");
    }
}
public class interface_2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        cat c = new cat();
        c.sound();
    }
    
}
