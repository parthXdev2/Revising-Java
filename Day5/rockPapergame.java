import java.util.*;

public class rockPapergame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissor" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock,paper,scissor)");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("InvalidChoice");
                continue;

            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice : " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie !");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("You win");

            } else {
                System.out.println("You Lose");

            }

            System.out.println("Play Again (yes/no)");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for Playing");
        sc.close();

    }
}