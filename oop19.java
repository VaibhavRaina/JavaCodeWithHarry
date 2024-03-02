abstract class pen{
   abstract void pen();
   abstract void write();

}

class fountainPen extends pen{
    void pen(){
        System.out.println("I am a fountain pen");
    }

    void write(){
        System.out.println("Writing !!");

    }

    void changeNib(){
        System.out.println("Chnaging nib");
    }
}




public class oop19 {

    public static void main(String[] args) {
        
    }
    
}
