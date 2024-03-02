import java.util.Scanner;

public class Twentytwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][]arr1=new int[3][3];
        int [][]arr2= new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the number at_" +i+j+ " -->" );
                arr1[i][j]=sc.nextInt();

            }
        }

        System.out.println("Given Matrix");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);
                System.out.print(" ");

            }

            System.out.println(" ");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[j][i]=arr1[i][j];

            }
        }

        System.out.println("Reverse Matrix");

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]);
                System.out.print(" ");

            }

            System.out.println(" ");
        }

    }
    
}
