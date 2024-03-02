class hello{
    int d;

    hello(){

        System.out.println("Hello my name is hello");
    }

    hello(int a){
        this.d=a;
        System.out.println("I am "+d);
        
    }




}

class mello extends hello{
      
       mello(int c,int d){
        super(d);
        System.out.println("Hello mello"+d);


       }
}

class chello extends mello{

    chello(int a ,int b,int c){
        super(5,7);
        System.out.println(a+b+c);



    }
}




public class oop11 {
    public static void main(String[] args) {
        hello hello = new hello(5);
        mello mello= new mello( 2,4);
        chello chello= new chello(3, 0, 0);
        
    }
    
}
