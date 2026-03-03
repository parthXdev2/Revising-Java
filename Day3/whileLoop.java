// While Loop = repeat some code forever until while some conditions remain true.

import java.util.*;

public class whileLoop{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = 0;

        while(age >= 0 && age < 18){
            System.out.print("Enter you age ");
            age = sc.nextInt();
        }
        System.out.println("Your age is "+age);

    }
}