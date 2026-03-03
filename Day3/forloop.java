import java.util.*;

public class forloop {
    public static void main(String[] args) {
        // for loop = execute some code until a certain amount of time  

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of time you want to  loop : ");
        int max = sc.nextInt();
        for(int i = 1; i <= max;i++){
            System.out.println(i);
        }

    }
}
