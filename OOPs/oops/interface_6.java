interface tvRemote{
    void on();
    void off();
}
interface smartremote{
    void yt();
    void prime();
}
class tv implements tvRemote,smartremote{
    public void on(){
        System.out.println("ON....");
    }
    public void off(){
        System.out.println("OFF.....");
    }
    public void yt(){
        System.out.println("Yt...");
    }
    public void prime(){
        System.out.println("Prime");
    }
}
public class interface_6 {
    public static void main(String[] args) {
        tv t = new tv();
        t.on();
        t.off();
        t.yt();
        t.prime();
    }
}
