import java.util.Scanner;

public class oop34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 90;
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        while (true) {
            try {
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("false input");
                System.out.println(e);
            } finally {
                System.out.println("End ");
            }
            --b;
        }
    }
}
