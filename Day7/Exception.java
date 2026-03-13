package WriteFiles;

import java.util.*;

public class Exception {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // (dividing by zero , file not found , mismatch input type)
        // Surrounded by dangerous code with a try {} block
        // try{} , catch{} , finally{}

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero ");
        }

    }
}
