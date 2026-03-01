import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double number2;

        number = random.nextInt(1,10);
        number2 = random.nextDouble(1,10);
        System.out.println(number);
        System.out.println(number2);

    }
}
