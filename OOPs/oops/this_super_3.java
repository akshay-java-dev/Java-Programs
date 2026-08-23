class person{
    String s = " Default Name";
    void show(){
        System.out.println("The Given String:- "+s);
    }
}
class student extends person{
    String s  = "Akshay";

    void show(){
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
public class this_super_3 {
    public static void main(String[]args){
        student s = new student();
        s.show();
    }   
}
