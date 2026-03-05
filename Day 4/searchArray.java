import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isFound = false;

        int[] num = { 1, 2, 3, 4, 8, 7, 9 };
        String[] fruits = {"apple", "orange", "banana", "guavas"};
        
        System.out.println("Enter fruit you want to buy : ");
        String target = sc.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("ELEMENT FOUND AT " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound) {
            System.out.println("ELement not found in the array");
        }
        sc.close();
    }
}
