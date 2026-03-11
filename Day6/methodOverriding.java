public class methodOverriding {
    public static void main(String[] args) {

        // Method Overriding =  When a subclass provides its own 
        // implementation of a method that is already defined.
        // Allows for a code reusability and give specific implementations.

        Dog dog = new Dog();
        Fish fish = new Fish();
        
        dog.move();
        fish.move();


    }
}
