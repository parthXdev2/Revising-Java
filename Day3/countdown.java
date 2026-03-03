import java.util.*;

public class countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much time is left for new year ? ");
        int start = sc.nextInt();

        for (int i = start; i >0 ; i--) {
        System.out.println(i);     
        }
        System.out.println("HAPPY NEW YEAR !");
    }
}
