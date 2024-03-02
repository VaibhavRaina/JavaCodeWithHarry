abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    }

    class smartPhone1 extends telephone{
        void ring(){
            System.out.println("Ringing");
        }
        void lift(){
            System.out.println("lifting");
        }
        void disconnect(){
            System.out.println("disconnected");
        }
        void call(){
            System.out.println("Calling");
        }




    }

public class oop21 {
    public static void main(String[] args) {
        telephone t= new smartPhone1();
        smartPhone1 sc= new smartPhone1();
        t.ring();
        //t.call(); not alllowed !!
        t.lift();
        sc.call();
        t.disconnect();        
        
    }
    
}
