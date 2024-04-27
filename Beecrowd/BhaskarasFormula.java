import java.util.Scanner;

public class BhaskarasFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a>0.00 && Math.pow(b,2)-(4*(a*c))>=0.00 ){

            System.out.printf("R1 = %.5f%n",(-b+(Math.sqrt(Math.pow(b,2)-(4*(a*c)))))/(2*a));
            System.out.printf("R2 = %.5f%n",(-b-(Math.sqrt(Math.pow(b,2)-(4*(a*c)))))/(2*a));
        }else{
            System.out.println("Impossivel calcular");
        }

       
    }
}
