import java.util.Scanner;

class age1{
    public void age(int a){
        if(a<0){
           throw new IllegalArgumentException("hehe !!clever boii");
        }

        try {
             int c=100/a;
         System.out.println(c);
            
        } catch (ArithmeticException e) {
            System.out.println("Hatta");
        }
        
   

    }

}

public class oop35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        age1 age= new age1();
        age.age(sc.nextInt());
    }
    
}
