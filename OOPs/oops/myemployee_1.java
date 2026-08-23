class employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int x){
        this.id = x;
    }
}
public class myemployee_1 {
    public static void main(String[]args){
        myemployee e = new myemployee();
        e.setName("Akshay");
        e.setId(38);
        System.out.println("My Employee Name :-"+e.getId());
        System.out.println("Id:-"+e.getId());
    }
    
}
