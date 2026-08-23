class circle{
    public int radius;
    circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    // Area of cy = πr2h;
    cylinder(int r ,int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*2*this.height;
    }
}
public class prob_1 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println(c.area());
        cylinder c1 = new cylinder(5, 5);
        System.out.println(c1.volume());
        
        
    }
    
}
