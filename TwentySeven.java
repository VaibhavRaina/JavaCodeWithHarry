public class TwentySeven {
    static int sum(int a) {
        if (a == 1) {
            return 1; // Base case: return 1 when 'a' becomes 1
        } else {
            return a + sum(a - 1); // Recursive call to sum with 'a-1'
        }
    }

    public static void main(String[] args) {
        int b = sum(4);
        System.out.println(b);
    }
}
