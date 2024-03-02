import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in a array");
        int n= sc.nextInt();
        int []arr=new int[100];
        boolean isth=false;
        for(int i=0;i<n;i++){
            System.out.print("Enter the element " +i+ "-");

            
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to see if present in the array");
        int p=sc.nextInt();
        for(int j=0;j<n;j++){
            if(p==arr[j]){
                
                isth=true;
               
            }

            if(isth==true){
                System.out.println("It is present at-"+j+" Position");
                break;
            }
            
            
        }

             if(isth==false){
                System.out.println("Not present");
                
            }


    }
    
}
