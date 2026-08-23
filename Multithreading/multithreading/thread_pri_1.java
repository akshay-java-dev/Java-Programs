class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i =1;
        while(i<2){
            System.out.println("I am a Thread :-" +getName());
            i++;
        }
    }
}
public class thread_pri_1 {
    public static void main(String[] args) {
        mythr t1 = new mythr("Akshay1");
        mythr t2 = new mythr("Akshay2");
        mythr t3 = new mythr("Akshay3");
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
