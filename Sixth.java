import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Float maths,physics,chemistry;
        System.out.println("Enter the marks for maths,physics and chemistry respectively out of 100");
        float sum;
        maths=sc.nextFloat();
        physics=sc.nextFloat();
        chemistry=sc.nextFloat();
        if(maths<33|| chemistry<33 || physics<33){
            System.out.println("You have failed");

        }

        else if (maths>100|| chemistry>100 || physics>100){
            System.out.println("Enter the marks correctly");
        }
        sum=(physics+maths+chemistry)/3.0f;
        System.out.println("Your total percentage ="+sum);

        if(sum<40){
            System.out.println("Your have failed");
        }
        else{
            System.out.println("You have passed");
        }
        
       



    }
    
}
