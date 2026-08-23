public class condtion {
    int mylogic(int a , int b){
        int c;
        if(a>b){
            c = a+b;

        }else{
            c = a*b;

            

        }
        return c;
    }
    public static void main(String[]args){
        int num1 = 6;
        int num2 = 4;

        condtion my = new condtion();
        int result = my.mylogic(num1 , num2);
        System.out.println("Result :-"+result);
    }
    
}
