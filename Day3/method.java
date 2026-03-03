public class method {
   public static void main(String[] args) {

    happyBirthday("Bro",18);
    System.out.println(square(5));
    System.out.println( cube(4));
    System.out.println(getFullName("Spongebob", "Squarepants"));

    int age = 21;
    if (ageValidation(age)) {
        System.out.println("You may signUp");
    }
    else{
        System.out.println("You must be 18+ to signUp");
    }
}
   static void happyBirthday(String name , int age){
    System.out.println("Happy Birthday to You ");
    System.out.printf("Happy Birthday Dear %s",name+"\n");
    System.out.printf("You are %d age",age );
    
   }
   static double square(double number){
        return number*number;
    }
   static double cube(double cubeOf){
            return cubeOf * cubeOf * cubeOf;
    }
   static String getFullName(String first , String last){
    return first + " " + last;
   }
   static boolean ageValidation(int age){
    if (age >= 18) {
        return true;

    }
    else {
        return false;
    }
   }
}
