import java.util.Scanner;

/**
 * Difference
 */
public class Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println("DIFFERENCE = "+((A*B)-(C*D)));
    }
}