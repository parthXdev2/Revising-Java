import java.util.*;

public class numberGuessinggame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNum = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess the number 1-50 ");

        do {
            System.out.println("Enter a guess");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNum) {
                System.out.println("TOO LOW");
            } else if (guess > randomNum) {
                System.out.println("TOO HIGH");
            } else {
                System.out.println("CORRECT ! The Number was " + randomNum);
                System.out.println("# of attempts are " + attempts);
            }

        } while (guess != randomNum);
    }

}