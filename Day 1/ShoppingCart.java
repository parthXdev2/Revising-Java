
// Shopping Cart Program
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double price, total;
        int quantity;

        // items to be bought
        System.out.print("What Item You Want To Buy ? ");
        item = sc.nextLine();
        // Price of the item
        System.out.print("What is the Price for Each ? ");
        price = sc.nextDouble();
        // quantity of the item
        System.out.print("How Many Would You Like To Have ? ");
        quantity = sc.nextInt();

        total = price*quantity;
        System.out.println("You have bought " + quantity + " " + item);
        System.out.println("Your Total is $" + price);


        sc.close();

    }
}
