import java.security.SecureClassLoader;
import java.util.Scanner;

class circle{
    private float r;
    
    public void setradius(float r1){

       
        r=r1;

    }

    public float getradius(){
        return r;
    }

    public float getarea(){
        return (float) (Math.PI * r * r);
    }
}

public class oop6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        circle circle= new circle();
        float r= sc.nextFloat();
        circle.setradius(r);
        System.out.println(circle.getarea());
        circle.getradius();
        
       
        
        
    }
    
}
