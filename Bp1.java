
import java.util.*;

interface stackOp {
    void push(int data);

    int pop();
};

class Fixed implements stackOp {
    int top = -1;
    int fstack[] = new int[100];

    public void push(int data) {
        top++;
        fstack[top] = data;

    }

    public int pop() {
        int value = -1;
        value = fstack[top];
        top--;
        return value;
    }
}

class Dynamic implements stackOp {
    ArrayList<Integer> dstack = new ArrayList<Integer>();

    public void push(int data) {
        dstack.add(data);
    }

    public int pop() {
        int value = -1;
        int rmv = dstack.size() - 1;
        value = dstack.remove(rmv);
        return value;
    }
}

public class Bp1 {
    public static void main(String[] args) {
        Dynamic d1 = new Dynamic();
        Fixed f1 = new Fixed();
        f1.push(3);
        f1.push(6);
        f1.pop();
        for (int i = 0; i <= f1.top; i++) {
            System.out.println(f1.fstack[i]);
        }
        d1.push(3);
        d1.push(6);
        d1.pop();
        for (int i = 0; i < d1.dstack.size(); i++) {
            System.out.println(d1.dstack.get(i));
        }
    }
}
