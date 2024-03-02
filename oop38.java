import java.util.Scanner;

class InvalidInpiut extends Exception{
    public String toString() {
        return "please enter the correct input";
    }
}

class DivideBy0 extends Exception {
    public String toString() {
        return "Can not divide by Zero";
    }
}

class MaxInput extends Exception {
    public String toString() {
        return "Enter value lower than 1lakh";
    }
}

class MaxMultiplier extends Exception {

    public String toString(){
        return "Enter multiplier lower than 7k";
    }
}

public class oop38 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double a, b;
        String s;

        while (true) {
            System.out.println("Enter + for Addition");
            System.out.println("Enter - for Subtraction");
            System.out.println("Enter * for Multiplication");
            System.out.println("Enter / for Division");
            s = sc.nextLine();

            switch (s) {
                case "+":
                    System.out.println("Enter value of Number 1");
                    a = sc.nextDouble();
                    System.out.println("Enter value of Number 2");
                    b = sc.nextDouble();
                    if (a >= 100000 || b >= 100000) {
                        System.out.println(new MaxInput().toString());
                    }
                    else if(a <= 100000 || b <= 100000){
                    System.out.println("Sum is = " + (a + b));
                    break;
                    }

                case "*":
                    System.out.println("Enter value of Number 1");
                    a = sc.nextDouble();
                    System.out.println("Enter value of Number 2");
                    b = sc.nextDouble();
                    if (a >= 7000 || b >= 7000) {
                        System.out.println(new MaxMultiplier().toString());
                    }
                     else if(a <= 100000 || b <= 100000){
                    System.out.println("Multiplication = " + (a * b));
                    break;
                    }
                    

                case "/":
                    System.out.println("Enter value of Number 1");
                    a = sc.nextDouble();
                    System.out.println("Enter value of Number 2");
                    b = sc.nextDouble();
                    if (a >= 100000 || b >= 100000) {
                        System.out.println(new MaxInput().toString());
                    }
                    if (b == 0) {
                        System.out.println(new DivideBy0().toString());
                    }
                    else if(a <= 100000 || b <= 100000){
                    double div = a / b;
                    System.out.println("Division =" + div);
                    break;
                    }
                   

                case "-":
                    System.out.println("Enter value of Number 1");
                    a = sc.nextDouble();
                    System.out.println("Enter value of Number 2");
                    b = sc.nextDouble();
                    if (a >= 100000 || b >= 100000) {
                        System.out.println(new MaxInput().toString());
                    }
                    else if(a <= 100000 || b <= 100000){
                    System.out.println("Value of Subtraction  = " + (a - b));
                    break;
                    }
                   

                default:
                    System.out.println("Please try again and enter a valid input.");
            }
            
            System.out.println("Do you want to continue? (yes/no)");
            String continueInput = sc.next();
            if (continueInput.equalsIgnoreCase("no")) {
                break;
            }

            sc.nextLine(); // Consume the newline left in the buffer
        }
    }
}