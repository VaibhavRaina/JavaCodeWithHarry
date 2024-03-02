import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
// class Test2 implements Cloneable{
//     LinkedList <Integer> l3 =new LinkedList<>();
//      public Test2(){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();

//         for (int i = 0; i < 10; i++) {
//             System.out.println("Add value at = " + i);
//              l3.add(sc.nextInt());
//         }
//      }


  
// }

public class oop40 {
    public static void main(String[] args) {
        LinkedList <Integer> l1 =new LinkedList<>();
       LinkedList <Integer> l2 =new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

         for (int i = 0; i < n; i++) {
             System.out.println("Add value at = " + i+"Adding "+l2.add(i));
             
         }

        
       
        // l1.add(45);
        // l1.add(34);
        // l1.add(23);
        // l1.add(321);
        // l1.remove(2);
        // l1.add(1, 234);
        // l1.isEmpty();
        // t2.l3.contains(12);
        // t2.l3.removeIf(n->(n%3==0));
        l2.removeFirstOccurrence(200);
         System.out.println(l2);
         
        
      
       
        // System.out.println(l1);
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        
    }
}
    

