class Thr extends Thread{
    public Thr(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("The name of thread = "+this.getName());
            i++;

        }

    }

}


public class oop27 {
    public static void main(String[] args) {
        Thr th1= new Thr("t1");
        Thr th2= new Thr("t2");
        Thr th3= new Thr("t3");
        Thr th4= new Thr("t4");
        th1.start();
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.start();
        th3.start();
        th4.start();
        th4.setPriority(Thread.MIN_PRIORITY);
        
    }
    
}
