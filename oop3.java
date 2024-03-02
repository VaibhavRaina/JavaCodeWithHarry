import java.util.Scanner;

class square{
        int length;
        public void area(){
            System.out.println("Area = "+ length*length);


        }

        public void peri(){
             System.out.println("Perimeter = "+ 4*length);

        }
    }

public class oop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square square=new square();
        square.length=sc.nextInt();
        square.area();
        square.peri();
    }
    
}
