import java.util.*;

public class arrays {
    public static void main(String[] args) {

        String[] fruits = { "apple", "banana", "grapes", "orange" };

        Arrays.sort(fruits);
        Arrays.fill(fruits , "pineapple");

        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }

    }
}
