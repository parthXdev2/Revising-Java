public class User {
    String userName;
    String email;
    int age;

    public User(String userName) {
        this.userName = userName;
        this.email = "not provided";
        this.age = 0;

    }
    public User(String userName,String email) {
        this.userName = userName;
        this.email = email;
        this.age = 0;

    }
    public User(String userName,String email,int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;

    }

}
