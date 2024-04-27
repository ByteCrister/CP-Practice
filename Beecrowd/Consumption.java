import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        float Y = sc.nextFloat();

        System.out.printf("%.3f km/l%n",((float)X/Y));
    }
}
