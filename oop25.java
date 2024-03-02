class thread1 implements  Runnable{
    public void run(){
        int i=1;
        while(i<4000000){
        System.out.println("vaibhav");
        i++;
        }

    }
}

class thread2 implements Runnable{
    public void run(){
        int i=1;
        while(i<4000000){
        System.out.println("tanishq");
        i++;
        }

    }
}


public class oop25 {
    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2= new thread2();
        Thread l1= new Thread(t1);
        Thread l2= new Thread(t2);
        l1.start();
        l2.start();
        
    }
    
}
