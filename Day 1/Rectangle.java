import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        double area = 0;
        double breadth = 0;
        double length = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length ");
        length = sc.nextDouble();

        System.out.print("Enter the bredth ");
        breadth = sc.nextDouble();

        area = length * breadth;

        System.out.println("The area of rectangle is " + area + "cm");

      sc.close();

    }
}