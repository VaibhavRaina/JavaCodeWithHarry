import java.util.Scanner;

public class oop30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=90;
        System.out.println("Enter the value of b");
        double b=sc.nextDouble();
       
        
        try {
             double c=a/b;
             System.out.println(c);
            
        } catch (Exception e) {
            System.out.println("false input");
            System.out.println(e);

            
        }
    }
    
}
