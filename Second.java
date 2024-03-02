import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter value fo a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        System.out.println("enter the value of c");
        c=sc.nextInt();

        int d = ((b*b)-(4*a*c))/(2*a);
        System.out.println(d);
        int e = b*b-(4*a*c)/(2*a);
        System.out.println(e);


    }
}
