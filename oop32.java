import java.util.Scanner;

class Expt extends Exception{
    public String toString(){
        return "Hello this is wrong !!";
    }

    public String getMessage(){
        return "This is a message";
    }

}



public class oop32 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a= sc.nextInt();
        if(a<10){
            try {
                throw new Expt();
            } catch (Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
    
}
