import java.util.*;

public class arraysUserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] food;
        int size;

        System.out.print("What # of food do you want ? ");
        size = sc.nextInt();
        sc.nextLine();
        food = new String[size];
        
        for(int i = 0; i < food.length; i++){
        System.out.print("Enter food to eat : ");
        food[i] = sc.nextLine();
        }    

        for(String foods : food){
            System.out.print(foods + " ");
        }
    
        sc.close();
    }
}
