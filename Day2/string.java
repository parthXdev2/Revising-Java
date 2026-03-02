// Strings are method of immutable sequence of characters.

public class string {
    public static void main(String[] args) {
        String name = "John Don";

        int length = name.length();
        String uppercase = name.toUpperCase();
        String lowercase = name.toLowerCase();
        char index = name.charAt(4);
        String trim = name.trim();

        System.out.println(length);
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(index);
        System.out.println(name.indexOf("Don"));
        System.out.println(trim);

        if (name.equals("John Don")) {
            System.out.println("Hello " + name);
        }

        if (!name.isEmpty()) {
            System.out.println("You don't have a name ");
        }

    }
}