import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = new String("My name is vaibhav");
        System.out.println(name.toLowerCase());
        System.out.println(name.replace( ' ', '_'));
        String greet=new String("Dear person , Thanks a lot");
        System.out.println(greet.replaceAll( "person", "Vaibhav"));
        System.out.println(greet.contains(" "));
        System.out.println(greet.contains("  "));
        String hello=sc.nextLine();
        System.out.println(hello);



    }
    
}
