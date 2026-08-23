class p{
    int a;
    
    public int getA(){
        return a;
    }
    p(int v){
        this.a = v;
    }
}
class p2 extends p{
    p2(int b){
        super(b);
        System.out.println(" I am a Constructor");
    }
}
public class this_super_2 {
    public static void main(String[]args){
        p e = new p(2);
        p2 c= new p2(3);
        System.out.println(e.getA());
    }
    
}
