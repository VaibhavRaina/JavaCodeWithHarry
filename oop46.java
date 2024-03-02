import java.util.ArrayList;
import java.util.Scanner;

public class oop46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> ar1= new ArrayList<>();
        for(int i=1;i<=10;i++){
            System.out.println("Add data for at "+i);
            ar1.add(sc.nextLine());

        }
        System.out.println(ar1);
    }
    
}
