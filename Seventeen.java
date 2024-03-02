import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=10;i++){
            sum=sum+(n*i);
        }
        System.out.println(sum);
    }
    
}
