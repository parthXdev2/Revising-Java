public class arrayObj {
    public static void main(String[] args) {
        
        Car car1 = new Car("Red","Mustang");
        Car car2 = new Car("Blue","Audi");
        Car car3 = new Car("Green","Corvette");

        Car[] cars = {car1,car2,car3};

        for(Car car : cars){
            car.drive();
        }
    }
}
