import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of students");
        int n=sc.nextInt();
        int []phy=new int[100];
        float sum=0;
        float avg;
        for(int i=0;i<n;i++){
            System.out.print("Enter the marks of student " +i+ " out of 100 " + " -");
            
            phy[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){

            sum=sum+phy[j];
            
        }

        avg=sum/n;
        System.out.println("Average marks");
        System.out.println(avg);
    }
    
}
