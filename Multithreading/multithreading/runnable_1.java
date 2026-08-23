class MyThreadrunnable implements Runnable{
    public void run(){
        int i = 1;
        while(i<3){
        System.out.println(" I am a thread not a threat");
        i++;
        }
    }
}
class MyThreadrunnable2 implements Runnable{
    public void run(){
        int i = 1;
        while(i<3){
        System.out.println("I am a Second Thread not a threat");
        i++;
        }
    }
}
public class runnable_1 {
    public static void main(String[] args) {
        MyThreadrunnable R1 = new MyThreadrunnable();
        Thread T1 = new Thread(R1);
        MyThreadrunnable2 R2 = new MyThreadrunnable2();
        Thread T2 = new Thread(R2);
        T1.start();
        T2.start();
    }
    
}
