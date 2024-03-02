import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String URL=sc.nextLine();
        if(URL.endsWith(".org")){
            System.out.println("Organisation website");

        }

        else if(URL.endsWith(".com")){
            System.out.println("Commercial website");

        }
        else{
            System.out.println("Indian website");
        }


    }
    
}
