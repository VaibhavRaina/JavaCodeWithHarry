import java.util.InputMismatchException;
import java.util.Scanner;

public class oop31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, m, p;

        try {
            System.out.println("Enter the number of elements in array");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the number at index " + i + " = ");
                arr[i] = sc.nextInt();
            }

            try {
                System.out.println("Enter the index for array element you want to divide");
                m = sc.nextInt();
                if (m < 0 || m >= n) {
                    System.out.println("Invalid index. Please enter a valid index.");
                    sc.close();
                    return;
                }

                System.out.println("Enter the number you want to divide it by");
                p = sc.nextInt();
                if (p == 0) {
                    System.out.println("Division by zero is not allowed.");
                    sc.close();
                    return;
                }

                System.out.println("The value at index " + m + " = " + arr[m]);
                System.out.println("The result of division = " + arr[m] / p);

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bond");
            } 
            catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } finally {
                sc.close();
            }

        } catch (InputMismatchException i) {
            System.out.println("Enter valid Input");
        }
    }
}
