public class scope {
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        String name = "Akshay";

        {
            a = 100;
            System.out.println(a);
        }

        int c = 200;
        {
            c = 300;
            System.out.println(c);
        }
    }


}
