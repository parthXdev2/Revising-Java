public class interfaces {
       public static void main(String[] args) {
        
        // Interfaces = A blueprint for a class that specifies a set of abstract
        // methods that implementing classes MUST define.
        // Supports multiple inheritance-like behaviour.
        
        // By using interface we can have multiple parents.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        
        rabbit.flee();
        hawk.hunt();
        



       }
}
