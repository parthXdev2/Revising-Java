// Calculator Program

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter first Number ");
        num1 = sc.nextDouble();

        System.out.print("Choose the Operator + , - , * , / , ^ ");
        operator = sc.next().charAt(0);

        System.out.print("Enter Second Number ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/': {
                if (num2 == 0) {
                    System.out.println("Canno divide by 0");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
                break;
            case '^':
                result = Math.pow(num1, num2);
            default:
                System.out.println("No Operator exist");
                validOperation = false;

        }

        if (validOperation) {
            System.out.println(result);
        }

    }
}
