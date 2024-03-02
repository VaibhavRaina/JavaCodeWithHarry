abstract class par{
    int l,b,h;
    abstract void area(int l,int b);

    abstract void volume(int l,int b,int h);

}

class rectangle1 extends par{
    void area(int l,int b){
        System.out.println("Area= "+l*b);
    }

    void volume(int l ,int b,int h){
        System.out.println("Vol= "+ l*b*h);
    }

}



public class oop16 {
    public class OOP16 {
    public static void main(String[] args) {
        rectangle1 rect = new rectangle1();
        rect.area(5, 6);
        rect.volume(4, 5, 6);

    }
}
}