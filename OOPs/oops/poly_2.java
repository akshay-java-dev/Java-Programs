class monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void Bite(){
        System.out.println("Biting....");
    }
}
class human extends monkey{
    void speak(){
        System.out.println("Speaking....");
    }
}
public class poly_2 {
    public static void main(String[] args) {
        monkey m = new human();
        m.jump();
        m.Bite();
      //  m.speak(); ---> cannot use speak method because the refereance is monkey which does not have speak method.
    }
    
}
