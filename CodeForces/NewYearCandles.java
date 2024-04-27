import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int totalHours = a;

        if ((a >= 1 && a <= 1000) && (b >= 2 && b <= 1000)) {

            while (a >= b) {
                totalHours += a / b;
                a = a/b+(a%b);

            }

            System.out.println(totalHours);
        }
    }
}
