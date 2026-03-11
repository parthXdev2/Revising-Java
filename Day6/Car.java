public class Car {
    String make;
    String model;
    String color;
    int year;


    Car(String make , String model ,String color ,int year){
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;

    }
    @Override
    public String toString(){
        return  this.color + " " + this.make + " " + this.model + " " + this.year;
       }
}
