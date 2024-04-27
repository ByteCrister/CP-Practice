import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", 0.5*(A*C));
        System.out.printf("CIRCULO: %.3f%n", 3.14159*Math.pow(C,2));
        System.out.printf("TRAPEZIO: %.3f%n", ((A+B)/2)*C);
        System.out.printf("QUADRADO: %.3f%n", Math.pow(B, 2));
        System.out.printf("RETANGULO: %.3f%n", A*B);
    }
}
