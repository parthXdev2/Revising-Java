import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        // Reading User Input
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Your Name");
        String name = scanner.nextLine(); 
        System.out.print("Enter Your age");
        int age = scanner.nextInt();

        System.out.println("Hello " +name );
        System.out.println("You are " +age );
        scanner.close(); 

    }  
}
