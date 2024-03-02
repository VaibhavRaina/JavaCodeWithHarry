import java.util.Scanner;

class Arra {
    public void Access(int n) {
        Scanner scr = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 1; i <= n; i++) {  
            System.out.println("Enter the element at index " + i + " = ");
            arr[i] = scr.nextInt();
        }
        
        int j = 0;
        boolean flag = true;
        while (flag && j<5 ){
            try {
                 System.out.println("Enter the value of index");
            int a = scr.nextInt();
            System.out.println("The value at index is = "+arr[a]);
            
            } catch (Exception e) {
                System.out.println("Wrong!!");
                j++;
            }
           

           
        }
        if(j>=5){
            System.out.println("Error");
        }
    }
}

public class oop36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arra arra = new Arra();
        System.out.println("Enter the number of elements you want in an array");
        arra.Access(sc.nextInt());
    }
}
