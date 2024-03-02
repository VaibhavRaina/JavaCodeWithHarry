import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the marks in Subject 1 out of 100");
       float a=sc.nextFloat();
       System.out.println("Enter the makrs in subject 2 out of 100");
       float b=sc.nextFloat();
       System.out.println("Enter the marks in subeject 3 out of 100");
      float c=sc.nextFloat();
      float per= (a+b+c)/3.0f;

       if(a>100 || b>100 || c>100){
        System.out.println("You have not entered valid marks");
       }

       else{

       System.out.println("The percentage in subject 1 is : " + a);
       System.out.println("The percentage in subject 2 is : " + b);
       System.out.println("The percentage in subject 3 is : " + c);
       System.out.println("Your percentage in cbse board is");
       System.out.println(per);

       }
    }
}
