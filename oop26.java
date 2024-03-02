class thread3 extends Thread{
    public thread3(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<=2){
            System.out.println("Hello");
            i++;
        }
    }
}




public class oop26 {
    public static void main(String[] args) {
        thread3 t3= new thread3("Vaibhav");
         thread3 t4= new thread3("Tanishq");
        t3.start();
        t4.start();
        System.out.println("Id of t3= " + t3.getId());
        System.out.println("Id for t4= "+ t4.getId());
        System.out.println("Id of t3= " + t3.getName());
        System.out.println("Id of t4= " + t4.getName());

        
    }
    
}
