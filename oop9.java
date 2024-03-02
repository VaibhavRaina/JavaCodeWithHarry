import java.util.Scanner;

class MyCylinder{
    private int r;
    private int h;

    MyCylinder(int r,int h){
        this.r =r;
        this.h=h;
        
       

    }

     double volume(){
        return (Math.PI * r * r* h);
    }
    double area(){
        return (2 * Math.PI * r * h);
    }
}





public class oop9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt(); 
        
        int h=sc.nextInt();
        
        MyCylinder cylinder= new MyCylinder(r,h);
       System.out.println( cylinder.area());
       System.out.println(cylinder.volume());
        
    }
    
}
