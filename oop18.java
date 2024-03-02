import java.util.Scanner;

interface Wifi{
    String []userName();
    String []password();

}

interface camera{
    void TurOn();
    void TSnap();

}

class cellphone{
    void call(){
        System.out.println("Do you wan tot call !!");
    }

    void ring(){
        System.out.println("Ringing !!");
    }
}

class SmartPhone extends cellphone implements camera,Wifi{
    Scanner sc = new Scanner(System.in);
    String [] username= new String[100];
    
    
    public String [] userName(){
        
        System.out.println("Add atmost 10 username for wifi");
        for(int i=1;i<10;i++){
            System.out.println("Adding username No "+i);
            username[i]=sc.nextLine();
            
        }
        

         System.out.println("Printing username");
         for(int i=1;i<10;i++){
          System.out.println("username"+username[i]);
          
         }
          return username;
    }

    public String[] password(){
         
         String [] password= new String[100];
         int n;
         System.out.println("Enter password of enter usernames in order");
         for(int i=1;i<10;i++){
            System.out.println("Adding password No "+i);
            password[i]=sc.nextLine();
         }

         System.out.println("Printing [passwords]");
          for(int i=1;i<10;i++){
          System.out.println("Password "+password[i]);
          
         }
         
         

         return password;
        
        

    }

    

        public void TurOn(){
            System.out.println("Turning on camers");
        }

        public void TSnap(){
            System.out.println("Takling Snap");

        }
    


       
}

public class oop18 {
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone();
        camera camera= new SmartPhone();
       smartPhone.userName();
      smartPhone.password();
      smartPhone.TSnap();
      smartPhone.TurOn();
      camera.TurOn();
     


        
    }
    
}
