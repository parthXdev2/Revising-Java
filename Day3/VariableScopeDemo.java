    public class VariableScopeDemo {

    // 1️⃣ Static Variable (Class Variable)
    static String institute = "ABC Institute";

    // 2️⃣ Instance Variables (Non-static)
    String name;
    int age;

    // Constructor (uses parameter variables)
    public VariableScopeDemo(String name, int age) {
        // Shadowing happening here
        this.name = name;  // instance variable = parameter
        this.age = age;
    }

    // Method demonstrating local and block scope
    public void displayDetails(int rollNo) {  // 3️⃣ Parameter variable

        // 4️⃣ Local Variable
        String grade = "A";

        System.out.println("Institute: " + institute); // static
        System.out.println("Name: " + name);           // instance
        System.out.println("Age: " + age);             // instance
        System.out.println("Roll No: " + rollNo);      // parameter
        System.out.println("Grade: " + grade);         // local

        // 5️⃣ Block Scope Variable
        if (age > 18) {
            String status = "Adult";  // block variable
            System.out.println("Status: " + status);
        }

        // System.out.println(status); ❌ Not accessible (out of block scope)
    }

    public static void main(String[] args) {

        // Local variable inside main
        int totalStudents = 1;

        VariableScopeDemo student1 = new VariableScopeDemo("Parth", 20);

        student1.displayDetails(101);

        System.out.println("Total Students: " + totalStudents);
    }
}

