class A extends Thread {
    int odd;

    A(int odd) {
        this.odd = odd;
    }

    public void run() {
        int num = 0;
        while (odd != 0) {
            int digit = odd % 10;
            num = num * 10 + digit;
            odd = odd / 10;
        }
        System.out.println(num);

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

public class Bp3 {
    public static void main(String[] args) {
        A t1 = new A(1123);
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
