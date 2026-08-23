class square_1{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class square {
    public static void main(String[]args){
        square_1 s = new square_1();
        s.side = 4;
        System.out.println(s.area());
        System.out.println(s.perimeter());

    }
    
}
