import java.util.Scanner;

public class Twentyfour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array");
        int n= sc.nextInt();
        int temp;
        int []arr=new int[n+1];
        for(int i=0;i<=n;i++){
            System.out.print("Enter the element " +i+ "-");

            
            arr[i]=sc.nextInt();
        }


        
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Maximum Element of array is = ");
        System.out.println(arr[n]);
        System.out.print("Minimum Element of array is = ");
        System.out.println(arr[0]);
    }

    
    
}
