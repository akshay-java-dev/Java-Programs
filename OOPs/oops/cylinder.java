class cylinder_1{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int n){
        this.radius = n;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int x){
        this.height = x;
    }
}
public class cylinder {
    public static void main(String[]args){
    cylinder_1 c = new cylinder_1();
    c.setHeight(4);
    c.setRadius(2);
    System.out.println(c.getHeight());
    System.out.println(c.getRadius());
    
}
}
