import java.util.*;

public class switchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String day;

        System.out.print("Enter the day of the week : ");
        day = sc.nextLine();

        switch (day) {
            case "Monday":System.out.println("Fresh Day");break;
            case "Tuesday":System.out.println("Fresh Day");break;
            case "Wednesday":System.out.println("Fresh Day");break;
            case "Thursday":System.out.println("Fresh Day");break;
            case "Friday":System.out.println("Fresh Day");break;
            case "Saturday":System.out.println("Fresh Day");break;
            case "Sunday":System.out.println("Fresh Day");break;
            default : System.out.println(day + " is not a day.");

        }

    }
}
