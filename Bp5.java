import java.util.*;

class MyException extends Exception {
    public String toString() {
        return "Wrong Input";
    }
}

public class Bp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        try {
            if (!(a + b > c && b + c > a && c + a > b)) {
                throw new MyException();
            }

        } catch (MyException e) {
            System.out.println(e.toString());
        }
        
    }

}
