import java.util.ArrayDeque;
import java.util.HashSet;

public class oop41 {
    public static void main(String[] args) {
        ArrayDeque <Integer> d1= new ArrayDeque<>();
        HashSet <Integer> hash= new HashSet<>(6, 0.5f);
        d1.add(34);
        d1.addFirst(231);
        d1.addLast(23);
        hash.add(34);
        hash.add(32);
        hash.add(1);
        hash.add(3);
        System.out.println(hash);
        System.out.println(d1.getFirst());
    }
    
}
