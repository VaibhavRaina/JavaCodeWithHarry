import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char temp;
        System.out.println("Enter the number of character for you word ");
        int n=sc.nextInt();
        char[] arr = new char[100];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of character at " + i + ": ");
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Sorting...");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) { 
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Printing sorted characters:");
        
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
