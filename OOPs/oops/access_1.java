class myemployee{
    private int id;
     private String name;
     public String getName(){
        return name;
     }
     public void setName(String s){
        name = s;
     }
     public int getId(){
        return id;
     }
     public void setId(int n){
        id = n;
     }
}
public class access_1 {
    public static void main(String[]args){
        myemployee e = new myemployee();
        //  throws as error due to private access modifiers
       // e.id = 38;
        //e.name = "Akshay"; 

        e.setId(38);
        e.setName("Akshay");
        System.out.println("Employee name :-"+e.getName());
        System.out.println("Employee id :-"+e.getId());
    }
    
}
