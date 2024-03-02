import java.util.Scanner;

public class Twentyfive {


    static int mult(int a){

        

        

        for(int i=1;i<=10;i++){

           System.out.println(a*i);


        }

        


        return 0;

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println( mult(n));
       


        
    }
    
}
