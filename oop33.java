class NegAr extends Exception{
    public String toString(){
        return "Exception";
    }

}



public class oop33 {
    public static int div(int a ,int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }

    public static double area(int r )throws NegAr{
        if(r<0){
            throw new NegAr();
        }
        double a=Math.PI*r*r;
        return a;
    }

    public static void main(String[] args) {
        try {
            int divide=div(3,2);
            System.out.println(divide);
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        try {
            double arr=area(4);
            System.out.println(arr);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
}
