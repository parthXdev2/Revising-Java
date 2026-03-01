import java.util.*;

public class mathclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circumfrence of Cirlce
        // Area
        // Volume

        double radius, area, volume, circumfrence;

        System.out.print("Enter the Value of Radius ");
        radius = sc.nextDouble();

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 2);
        System.out.println("Volume of sphere is " + volume);
    }
}
