public class Friend {

    static int numberOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numberOfFriends + " of total friends.");
    }
}
