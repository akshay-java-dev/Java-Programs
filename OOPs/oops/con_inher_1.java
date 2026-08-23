class Base{
    public int x;
    Base(){
        System.out.println("I am an Constructor");
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived extends Base{
    public int y;
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class con_inher_1 {
    public static void main(String[]args){
        Base b = new Base();
        //b.setX(4);
        
       // System.out.println(b.getX());
        Derived d = new Derived();
        //d.setY(5);
        //System.out.println(d.getY());

    }
    
}
