import java.util.Scanner;

/**
 * SimpleCalculate
 */
public class SimpleCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product1 = sc.nextInt();
        int product1Unit = sc.nextInt();
        double product1Price = sc.nextDouble();

        int product2 = sc.nextInt();
        int product2Unit = sc.nextInt();
        double product2Price = sc.nextDouble();


        double value = (product1Price*product1Unit) + (product2Price*product2Unit);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",value);
    }
}