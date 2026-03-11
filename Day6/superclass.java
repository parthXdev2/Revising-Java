public class superclass {
    public static void main(String[] args) {

        // Super - refer to the parent class (subclass > superclass)
        // Used in contructors and methods overriding
        // Call the parent contructor to initialize attributes .
          
        Person person = new Person("Harry", "Potter");
        // person.showName();
        Student student = new Student("Tom", "Riddle", 10.5);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Steve", "Roger", 10000);
        employee.showName();
        employee.showSalary();
    }
}