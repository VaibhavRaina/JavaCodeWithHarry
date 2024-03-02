import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of salary");
        int amount = sc.nextInt();
        float tax = 0.0f;

        if (amount < 0) {
            System.out.println("Invalid amount entered. Amount must be non-negative.");
        } else if (amount < 250000) {
            tax = 0.0f;
        } else if (amount < 500000) {
            tax = 0.05f * (amount - 250000);
        } else if (amount < 1000000) {
            tax = 0.2f * (amount - 500000) + 0.05f * 250000;
        } else {
            tax = 0.3f * (amount - 1000000) + 0.2f * 500000 + 0.05f * 250000;
        }

        System.out.println("Your income tax = " + tax);
    }
}
