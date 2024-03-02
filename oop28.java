class thr1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("Good Morning !!");
        i++;
        }
    }


}

class thr2 extends Thread{
    public void run(){
        int i=0;
         while(i<100){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            i++;
        }

    }
}



public class oop28 {
    public static void main(String[] args) {
        thr1 thr1= new thr1();
        thr2 thr2= new thr2();
        thr1.start();
        thr1.setPriority(2);
        thr2.start();
        thr2.setPriority(3);
        System.out.println("t1 piority is"+thr1.getPriority());
        System.out.println("t2 piority is"+thr2.getPriority());
        
       
        
    }
    
}
