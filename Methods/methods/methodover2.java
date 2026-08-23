public class methodover2 {
    static void foo(){
        System.out.println("Good Moring bro");
    }
    static void foo(int a){
        System.out.println("Good Moring " +a+ "bro");
    }
    static void foo(int a,int b){       /// parameters
        System.out.println("Good Moring " +a+ "bro");
        System.out.println("Good Moring " +b+ "bro");
    }

    public static void main(String[]args){
        foo();
        foo(3000);
        foo(3000,4000);  //arguments are actual!
    }
    
}
