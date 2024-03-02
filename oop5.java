import java.util.Scanner;

class TommyVicettie{
    public void Hit(){
        System.out.println("Hitting");
    }

     public void Run(){
        System.out.println("Running");
    }
}


public class oop5 {
    public static void main(String[] args) {
        String write;
        Scanner sc = new Scanner(System.in);
        write=sc.nextLine();
        TommyVicettie TommyVicettie= new TommyVicettie();

        if(write.equals("h")){
            TommyVicettie.Hit();


        }

        else if(write.equals("r")){
            TommyVicettie.Run();
        }
        
    }
    
}
