import java.util.*;

public class weightConvertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs into kgs");
        System.out.println("2: Convert kgs into lbs");

        System.out.print("Enter your Choice ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter the weight in lbs");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The value of weight is " + newWeight);

        } else if (choice == 2) {
            System.out.println("Enter the weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The value of weight is " + newWeight);
        }
        else {
            System.out.println("The choice is not valid !");
        }

        sc.close();

    }
}
