class circle{
    int r,h;
    circle(int a){
        this.r=a;

    }
    double area(){
        return Math.PI*r*r;
    }


}

class cylinder extends circle{
    cylinder(int r,int h){
        super(r);
        this.h=h;
    }

    double vol(){
         return Math.PI*r*r*h;
    }
    

}





public class oop14 {
    public static void main(String[] args) {
        circle circle= new circle( 4);
        cylinder cylinder= new cylinder(3, 4);
        System.out.println(circle.area());
        System.out.println(cylinder.vol());
        System.out.println(cylinder.area());
        
        

        
    }
    
}
