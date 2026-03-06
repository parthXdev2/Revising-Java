public class modifier {
    
    static abstract class Animal{
        abstract void makeSound();
    }

    static class Dog extends Animal{
        void makeSound(){
            System.out.println("Dog Barks");
        }
    }
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.makeSound();

    }
}
