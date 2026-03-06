public class overloadConstructor {
    public static void main(String[] args) {
        
        User user1 = new User("Spongebob");
        User user2 = new User("Spongebob","Pt123@aol.com");
        User user3 = new User("Sandy","sandy252@gmail.com",25);


        System.out.println(user1.userName);
        System.out.println(user2.email);
        System.out.println(user3.age);
    }
}
