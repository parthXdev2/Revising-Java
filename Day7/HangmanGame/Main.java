package HangManGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Parth\\Documents\\Java\\Day 10\\HangManGame\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Welcome to Java Hangman");
        System.out.println("***********************");

        while (wrongGuess < 6) {
            System.out.println("Word : ");

            for (Character character : wordState) {
                System.out.print(character + " ");
            }
            System.out.println();

            System.out.print("Guess the letter : ");
            char guess = sc.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.print(getHangmanArt(wrongGuess));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was " + word);
                    break;
                }
            } else {
                wrongGuess++;
                System.out.print(getHangmanArt(wrongGuess));
                System.out.println("WRONG GUESS");
            }

        }

        if (wrongGuess >= 6) {
            System.out.print(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER!");
            System.out.println("The word was " + word);
        }
        sc.close();

    }

    static String getHangmanArt(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """

                    """;
            case 1 -> """
                      0
                    """;
            case 2 -> """
                      0
                      |
                    """;
            case 3 -> """
                      0
                     /|
                    """;
            case 4 -> """
                      0
                     /|\\
                    """;
            case 5 -> """
                      0
                     /|\\
                     /
                    """;
            case 6 -> """
                      0
                     /|\\
                     / \\
                    """;

            default -> "";
        };
    }
}
