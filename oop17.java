interface Cars{
    public void engine();
    public void price();
}

class AudiR8 implements Cars{
    public void engine(){
        System.out.println("It is V8 engine");
        
    }
    public void price(){
        System.out.println("Price is about 100kgrand");
    }
}


public class oop17 {
    public static void main(String[] args) {
        AudiR8 audiR8= new AudiR8();
    audiR8.engine();
    audiR8.price();

        
    }
  
    
    
}
