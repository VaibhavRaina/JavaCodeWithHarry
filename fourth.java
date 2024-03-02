import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Given Number is 20");
        System.out.println("Put a numeber ");
        int b = sc.nextInt();
       // boolean great=sc.equals(a>20);
       if(b>20){
        System.out.println("greater");
       }

       else{
        System.out.println("Smaller");
       }


       float a,u,v,s;
       a=sc.nextFloat();
       u=sc.nextFloat();
       v=sc.nextFloat();
       s=sc.nextFloat();
       float sol;

       sol=(v*v-u*u)/(2*a*s);
       System.out.println(sol);

        

    }
    
}
