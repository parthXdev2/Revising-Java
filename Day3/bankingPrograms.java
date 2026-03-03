import java.util.*;

public class bankingPrograms {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaring Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("**************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4) : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = balance + deposit();
                    break;
                case 3:
                    balance = balance - withDraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }

        System.out.println("Thank You ! Have a nice day.");

        sc.close();
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.println("Enter an amount to be deposited ");

        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("The amount can't be less than 0");
            return 0;
        } else {
            return amount;
        }

    }

    static double withDraw(double balance){
        double drawings;
        System.out.print("Enter amount to be withdrawn ");
        drawings = sc.nextDouble();

        if (drawings > balance) {
            System.out.println("Insuffient Funds");
            return 0;

        }
        else if(drawings < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return drawings;
        }


    }

}
