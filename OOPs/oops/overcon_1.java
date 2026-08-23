class rectangle{
    private int len;
    private int bre;

    public rectangle(){
        this.len = 4;
        this.bre = 5;
    }
    public rectangle(int len , int bre){
        this.len = len;
        this.bre = bre;
    }
    public int getLen(){
        return len;
    }
    public int getBre(){
        return bre;
    }
}
public class overcon_1 {
    public static void main(String[]args){
        rectangle r = new rectangle();
        System.out.println(r.getLen());
        System.out.println(r.getBre());
    }
    
}
