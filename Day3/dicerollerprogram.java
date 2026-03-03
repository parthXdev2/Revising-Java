import java.util.*;

public class dicerollerprogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numOfdice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfdice = sc.nextInt();

        if (numOfdice > 0) {
            for (int i = 0; i < numOfdice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You have rolled " + roll);
                total = total + roll;

            }
            System.out.println("Total : " + total);
        } else {
            System.out.println("Number of dice must be greater than 0");
        }

    }

    static void printDie(int roll) {
        String dice1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------

                """;
        String dice2 = """
                     -------
                    | ●     |
                    |       |
                    |     ● |
                     -------

                """;
        String dice3 = """
                     -------
                    | ●     |
                    |   ●   |
                    |     ● |
                     -------

                """;

        String dice4 = """
                     -------
                    | ●   ● |
                    |       |
                    | ●   ● |
                     -------

                """;
        String dice5 = """
                     -------
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                     -------

                """;

        String dice6 = """
                     -------
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                     -------

                """;

        switch (roll) {
            case 1:
                System.out.print(dice1);
                break;
            case 2:
                System.out.print(dice2);
                break;
            case 3:
                System.out.print(dice3);
                break;
            case 4:
                System.out.print(dice4);
                break;
            case 5:
                System.out.print(dice5);
                break;
            case 6:
                System.out.print(dice6);
                break;
            default:
                System.out.println("Invalid Role");
        }

    }

}