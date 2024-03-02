import java.util.Scanner;

public class Twentythree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array");
        int n= sc.nextInt();
        int temp;
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element " +i+ "-");

            
            arr[i]=sc.nextInt();
        }
        
       
        System.out.println("Unsorted Array");

         for(int i=0;i<n;i++){
           System.out.print(arr[i]);
           System.out.println(" ");
        }


        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array");

        for(int i=0;i<n;i++){
           System.out.print(arr[i]);
           System.out.println(" ");
        }
    }
    
}
