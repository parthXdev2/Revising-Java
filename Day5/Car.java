public class Car {
    String color;
    String model;

    public Car(String color , String model) {
    
        this.color = color;
        this.model = model;
    
    }

    void drive(){
        System.out.println("you drive "+color+" "+model);
    }
}
