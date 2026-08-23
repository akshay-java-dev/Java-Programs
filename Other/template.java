public class template{
    public static void main(String[]args){
        String letter = "Dear <|name|>,Thanks a lot";
        String name = letter.replace("<|name|>","Akshay");
        System.out.println(name);
    }
}