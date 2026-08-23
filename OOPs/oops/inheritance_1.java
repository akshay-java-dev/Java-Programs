class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x; 
    }
    public void printme(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
}
public class inheritance_1 {
    public static void main(String[]args){
        Base b=new Base();
        b.setX(4);
        Derived d = new Derived();
        d.setY(5);
        System.out.println(b.getX());
        System.out.println(d.getY());


    }
    
}
