interface process {
    void action(int a, int b);
}

public class Bp7 {
    public static void main(String[] args) {
        process p1 = (x, y) -> {
            System.out.println(x + y);
        };
        process p2 = (x, y) -> {
            System.out.println(x * y);
        };
        p1.action(2, 3);
        p2.action(3, 4);
    }
}
