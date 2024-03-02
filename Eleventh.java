import java.util.Random;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Random random=new Random(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("DON'T ENTER NUMBER GREATER THAN 2 AS YOU WILL LOOSE THAT ROUND !!!");
        System.out.println("Enter the number of rounds you want with the Computer");
        int rounds=sc.nextInt();
       
        
        int Ppoints=0;
        int Cpoints=0;
        int comp=random.nextInt(2);
   

        for(int a =1;a<=rounds;a++){
             System.out.println("Enter 0,1,2 for ROCK PAPER AND SICSSOR RESPECTIVELY");
            int number=sc.nextInt();
            System.out.println();
            System.out.println("Round"+a);

                  if(number ==0){

            System.out.println(name+"-Rock");

        }
        else if(number ==1){

            System.out.println(name+"-Paper");

        }

        else if(number ==2){

            System.out.println(name+"-Sicssor");

        }

        else{
            System.out.println("Please enter a valid number");
            
        }
         if(comp ==0){

            System.out.println("Computer-Rock");

        }
        else if(comp ==1){

            System.out.println("Computer-Paper");

        }

        else if(comp ==2){

            System.out.println("Computer-Sicssor");

        }
             
         if(number ==0 && comp==2){

            System.out.println(name+"Won This Round");
            Ppoints++;

        }
        else if(number ==1&& comp==0){

            System.out.println(name+"Won This Round");
             Ppoints++;

        }

        else if(number ==2&& comp==1){

           System.out.println(name+ "Won This Round");
            Ppoints++;

        }
        else if(number==comp){
            System.out.println("It's a tie in This Round");
             Ppoints++;
             Cpoints++;
        }

        else{
            System.out.println("Computer Won This Round");
            Cpoints++;
        }


        System.out.println("Your Points--"+Ppoints);
        System.out.println("Computer Points--"+Cpoints);
       

        }

        if(Ppoints>Cpoints){
            System.out.println(name+"Won!!");

        }

        else if(Ppoints==Cpoints){

            System.out.println("It's a Tie");


        }

        else{
            System.out.println("Computer Won");
        }

    }
    
}
