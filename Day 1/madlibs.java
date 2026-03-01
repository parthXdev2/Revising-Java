import java.util.*;

public class madlibs {
    public static void main(String[] args) {
        
        // MAD LIBS GAME 

        Scanner sc = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb;
        String adj3;

        System.out.print("Enter an adjective");
        adj1 = sc.nextLine();
        System.out.print("Enter a noun");
        noun1 = sc.nextLine();
        System.out.print("Enter an adjective");
        adj2 = sc.nextLine();
        System.out.print("Enter a verb");
        verb = sc.nextLine();
        System.out.print("Enter an adjective");
        adj3 = sc.nextLine();



        System.out.println("Today I went to a " +adj1);
        System.out.println("In an exhibit I saw a " +noun1);
        System.out.println(noun1 + "was" + adj2 + "and " + verb + "!");
        System.out.println("I was " + adj3 + "!");



    }
}
