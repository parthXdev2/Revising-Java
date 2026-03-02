// Implemented substring using Email Slicer Project
// Substring is a method to extract a portion of a string .substring(start,end)

import java.util.Scanner;

public class substringproject {
    public static void main(String[] args) {

        String email, username, domain;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email ");
        email = sc.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1);
            System.out.println(username);
            System.out.println(domain);

        } else {
            System.out.println("Email Must Contain @ ");
        }
    }
}
