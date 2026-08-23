interface demo{
    void playing();
    void running();
    void dancing();
}
class Boy implements demo{
   public void playing(){
    System.out.println("The Boy is Playing");
   }
   public void running(){
    System.out.println("The Boy is Running on Ground");
   }
   public void dancing(){
    System.out.println("The Boy is Dancing on Stage");
   }
}
class Girl implements demo{
    public void playing(){
        System.out.println("The Girl is playing on Ground");
    }
    public void running(){
    System.out.println("The Girl is running on ground");
    }
    public void dancing(){
        System.out.println(" The Girl is Dacncing on Stage");
    }
}
public class interface_3 {
    public static void main(String[] args) {
        Boy b =  new Boy();
        b.playing();
        b.running();
        b.dancing();
        Girl g = new Girl();
        g.dancing();
        g.playing();
        g.running();
    }
    
}
