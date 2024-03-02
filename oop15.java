class rect{
    private int l,b,h;

    int area(){
        return l*b;
    }
    
    void setl(int l){
        this.l=l;

    }
    int getl(){
        return l;
    }

     void setb(int b){
        this.b=b;

    }
    int getb(){
        return b;
    }

    void seth(int h){
        this.h=h;

    }
    int geth(){
        return h;
    }

    class cuboid extends rect{
       
        int volume(){

            return l*b*h;
        }
        int area(){
            return (2*l*b+2*b*h+2*h*l);
        }


        



    }
    
    

}


public class oop15 {

    public static void main(String[] args) {
        rect rect = new rect();
        rect.getl();
        rect.getb();
        rect.geth();
        rect.setb(5);
        rect.seth(7);
        rect.setl(5);
        System.out.println(rect.area());
        
    }
    
}
