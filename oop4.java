import java.util.Scanner;

class rectangle{

    int l,b;

    public void area(){
        System.out.println("The area of rectangle = " + l*b);

    }

    public void peri(){
        System.out.println("The permiter of rectangle = " + 2*(l+b));

    }



}

public class oop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rectangle= new rectangle();
        System.out.println("Enter Length");
        rectangle.l=sc.nextInt();
        System.out.println("Enter breadth");
        rectangle.b=sc.nextInt();
        rectangle.area();
        rectangle.peri();

        
    }
    
}
