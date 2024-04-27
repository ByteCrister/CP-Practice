import java.util.Scanner;

/**
 * Sphere
 */
public class Sphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14159;

        double radius = sc.nextDouble();
        System.out.printf("VOLUME = %.3f%n", (4/3.0)*pi*Math.pow(radius, 3));

    }
}