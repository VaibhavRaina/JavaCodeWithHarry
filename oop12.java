class A {
    void hello(){
        System.out.println("I am vaibhav raina");
    }
}

class B extends A{
    @Override
    void hello(){
        System.out.println("I am vaibhav");
    }
    void mello(){
        System.out.println("U are vaibhav");
    }


}



public class oop12 {
    public static void main(String[] args) {
        A a = new A();
        B b= new B();
        a.hello();
        b.hello();
        b.mello();


        
    }
    
}
