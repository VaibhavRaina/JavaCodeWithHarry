public class TwentyEight {
    static int fib(int a){
        if(a==1){
            return 0;
        }

        else if(a==2){
            return 1;
        }

        else{
            return fib(a-1)+fib(a-2);
        }
    }
    public static void main(String[] args) {
        int n=10;
        int fib = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
    }
    
}
