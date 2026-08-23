class Ekclass{
    int a;

    public int getA(){
        return a;
    }
    Ekclass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am an constructor");
    }
}
public class this_super_1 {
    public static void main(String[]args){
        Ekclass e = new Ekclass(5);
        Doclass d = new Doclass(4);
        System.out.println(e.getA());
    }
    
}
