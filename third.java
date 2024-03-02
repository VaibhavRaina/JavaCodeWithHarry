import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter your grade");
        char b= sc.next().charAt(0);
        char c= (char) (b+8);
        System.out.println("Decrypted Grade is : " + c);
        System.out.println("Enrypted grade is " + b);


    
}
}
