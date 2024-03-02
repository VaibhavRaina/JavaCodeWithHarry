

interface Paramerter{
    void Rectangle();
    void Square();
    void Sphere();
    void Circle();
}

class Shape implements Paramerter{
    public int l,b,h;

    Shape(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    @Override
    public void Rectangle(){
        System.out.println("Area = "+ l*b);
        System.out.println("Volume = " +l*b*h);
    }
    @Override
    public void Square(){
        System.out.println("Area = "+ l*b);
        System.out.println("Volume = " +l*b*h);
    }
    @Override
    public void Circle(){
        System.out.println("Area = "+ l*l);
        System.out.println("Volume = " +l*l*l);
    }
    @Override
    public void Sphere() {
      System.out.println("Area = "+4*Math.PI*l*l);
        System.out.println("Volume = " +(4*Math.PI*l*l*l)/3);
    }






}

public class oop23 {
    public static void main(String[] args) {
        Shape shape=new Shape(5,6,7);
        shape.Rectangle();
        shape.Square();
        shape.Circle();
        shape.Sphere();

        
        
    }
    
}
