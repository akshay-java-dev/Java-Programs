class c1{
    public int x =4;
    protected int y =5;
    int a = 1;
    private int b = 9;
    }
    class c2 extends c1{
            public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        //System.out.println(b);
        }
    }

public class modifiers {
    public static void main(String[] args) {
        c2 c = new c2();
        c.meth1();
    }
}
