import java.util.Scanner;

class Cylinder{
    int r,h;
      void setHeight(int h1){
        h=h1;

    }

    public  int getHeight(){
        return h;
    }
    

    void setRadius(int r1){
        r=r1;

    }

    public int getRadius(){
        return r;
    }
    double volume(){
        return (Math.PI * r * r* h);
    }
    double area(){
        return (2 * Math.PI * r * h);
    }
}

public class oop8 {
    public static void main(String[] args) {
        int r,h;
        
        Cylinder cylinder= new Cylinder();
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        
        
        cylinder.setRadius(r);
       System.out.println( "Radius of cylinder= "+cylinder.getRadius());
        h=sc.nextInt();
        cylinder.setHeight(h);
        System.out.println("Height of cylinder= "+cylinder.getHeight());
        System.out.println("Arera of cylinder= "+cylinder.area());
        System.out.println("Volume of cylinder= "+cylinder.volume());

        
    }
    
}
