public class Employee extends Person{
    int salary;

    Employee(String first , String last , int salary){
        super(first,last);
        this.salary = salary;

    }

    void showSalary(){
        System.out.println("The employee is credited with $"+this.salary);
    }
}