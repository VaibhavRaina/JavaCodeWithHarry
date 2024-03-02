import java.util.Scanner;

class Rectangle{
    private int l;
    private int b;

    Rectangle(){

        l=4;
        b=7;

    }

    Rectangle(int l1,int b1){
        this.l=l1;
        this.b=b1;

    }

    int area(){
        return l*b;
    }
}

public class oop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
           int h=sc.nextInt();
        Rectangle rectangle=new Rectangle();
        Rectangle rectangle1=new Rectangle(l,h);
        System.out.println(rectangle.area());
        System.out.println(rectangle1.area());



        
    }
    
}
