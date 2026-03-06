public class constructor {
    public static void main(String[] args) {
        students student1 = new students("Spongebob",30,8.5);
        students student2 = new students("Patrick",25,5.5 );
        students student3 = new students("Sandy",22,7.5 );

        student1.study();
        student2.study();
        student3.study();

    }
}
