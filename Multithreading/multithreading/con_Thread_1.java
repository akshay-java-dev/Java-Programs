class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i <= 3){
            System.out.println("I am a Thread");
            i++;
        }
    }
}

public class con_Thread_1 {
    public static void main(String[] args) {
        MyThr T = new MyThr("Akshay");
        T.start();
        System.out.println("The Thread Id :=" +T.getId());
        System.out.println("The Thread Name is :-" +T.getName());
        
    }
}
