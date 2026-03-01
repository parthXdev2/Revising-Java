import java.util.Scanner;

public class CompountInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double r, n, t;

        System.out.print("Enter the Principal ");
        principal = sc.nextDouble();

        System.out.print("Enter the value of R ");
        r = sc.nextDouble();

        System.out.print("Enter the value of N ");
        n = sc.nextDouble();

        System.out.print("Enter the value of T ");
        t = sc.nextDouble();

        double amount = principal * Math.pow((1 + r / 100), n * t);

        System.out.println("The Amount is " +amount);
    }

}
