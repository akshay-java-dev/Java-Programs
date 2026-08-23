class rectangle{
    int length;
    int breath;

public int rect_area(){
    return length*breath;
}
public int rect_peri(){
    return 2*(length+breath);
}
}
public class rect_1 {
    public static void main(String[]args){
        rectangle r=new rectangle();
        r.length = 2;
        r.breath = 3;

        System.out.println(r.rect_area());
        System.out.println(r.rect_peri());
    }
    
}
