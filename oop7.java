import java.util.Random;
import java.util.Scanner;

class Challenge {
    int usr, comp;
    int score = 0;

    Challenge() {
        Random random = new Random();
        comp = random.nextInt(100);
    }

    public void takeUserInput() {
        System.out.println("Enter Your Guess");
        Scanner sc = new Scanner(System.in);
        usr = sc.nextInt();
    }

    public void isCorrect() {
        if (usr > comp) {
            System.out.println("Your Number is Higher");
            score++;
        } else if (usr < comp) {
            System.out.println("Your Number is Lower");
            score++;
        }
    }

    public void breaker() {
        if (usr == comp) {
            System.out.println("CONGRATULATIONS!! YOU WON ");
            System.out.println("YOUR SCORE = " + score);
        }
    }

    public void tester() {
        System.out.println(comp);
    }
}

public class oop7 {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.tester();

        while (true) {
            challenge.takeUserInput();
            challenge.isCorrect();
            challenge.breaker();
            if (challenge.usr == challenge.comp) {
                break; 
            }
        }
    }
}
