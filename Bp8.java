import java.util.Scanner;

public class Bp8 {
    public static void main(String[] args) {
        String s;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine().toUpperCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                num++;
            }
        }
        System.out.println(num);
    }
}
