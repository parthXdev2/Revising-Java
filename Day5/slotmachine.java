import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaring Variables
        int balance = 100;
        int bet;
        int payOut;
        String[] row;
        String playAgain;

        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols : 🍒 🍉 🍎 🍇 🍊");

        while (balance > 0) {
            System.out.println("Current balance : $" + balance);
            System.out.print("Place your balance amount : ");
            bet = sc.nextInt();
            sc.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient Funds");
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payOut = getPayOut(row, bet);

            if (payOut > 0) {
                System.out.println("You Wonnn $" + payOut);
                balance = balance + payOut;
            } else {
                System.out.println("Sorry you lost this round. ");
            }

            System.out.println("Do You Want to play again ?: ");
            playAgain = sc.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }

        }
        System.out.println("Game Over ! You final balance is " + balance);

    }

    static String[] spinRow() {

        String[] symbols = { "🍒", "🍉", "🍎", "🍇", "🍊" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;

    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }

    static int getPayOut(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 5;
                case "🍎" -> bet * 7;
                case "🍇" -> bet * 9;
                case "🍊" -> bet * 10;
                default -> 0;

            };
        }

        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 4;
                case "🍎" -> bet * 6;
                case "🍇" -> bet * 8;
                case "🍊" -> bet * 10;
                default -> 0;

            };
        }

        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 4;
                case "🍎" -> bet * 6;
                case "🍇" -> bet * 8;
                case "🍊" -> bet * 10;
                default -> 0;

            };
        }

        return 0;
    }
}
