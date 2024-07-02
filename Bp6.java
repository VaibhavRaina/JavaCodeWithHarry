class Sync {
    synchronized static void displayTable(int num) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + "=" + num * i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Mult extends Thread {
    int n;

    Mult(int n) {
        this.n = n;
    }

    public void run() {
        try {
            Sync.displayTable(n);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

public class Bp6 {
    public static void main(String arges[]) {
        Mult m1 = new Mult(8);
        Mult m2 = new Mult(9);
        m1.start();
        m2.start();
    }
}


