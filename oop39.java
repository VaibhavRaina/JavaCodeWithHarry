import java.util.ArrayList;
import java.util.Scanner;
class Test2 implements Cloneable{
     ArrayList <Integer> l3 =new ArrayList<>();
     public Test2(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Add value at = " + i);
             l3.add(sc.nextInt());
        }
     }


  
}

public class oop39 {
    public static void main(String[] args) {
        ArrayList <Integer> l1 =new ArrayList<>();
        ArrayList <Integer> l2 =new ArrayList<>();
        Test2 t2= new Test2();
        l1.add(45);
        l1.add(1,34);
        l1.add(23);
        l1.add(321);
        l1.isEmpty();
        t2.l3.contains(12);
        t2.l3.removeIf(n->(n%3==0));
        System.out.println(t2.l3);
      
       
        // System.out.println(l1);
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        
    }
}
    

