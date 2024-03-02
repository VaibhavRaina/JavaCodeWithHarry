class thread1 extends Thread{
    public void run(){
        int i=1;
        while(i<4000000){
        System.out.println("vaibhav");
        i++;
        }

    }
}

class thread2 extends Thread{
    public void run(){
        int i=1;
        while(i<4000000){
        System.out.println("tanishq");
        i++;
        }

    }
}


public class oops24 {
    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
        
    }
    
}
