public class overloading {
    public static void main(String[] args) {
        
        // Overloading Methods 
        String pizza = getPizza("ThinCrust ", "Mozzarella ","Onion ");
        System.out.println(pizza);
    }

    static String getPizza(String bread){
        return bread + "pizza"; 
    }

    static String getPizza(String bread , String cheese){
        return cheese + bread + " pizza"; 
    }

    static String getPizza(String bread , String cheese , String toppings){
        return toppings + cheese + bread + "pizza"; 
    }



}
