import java.util.Scanner;

class Snack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double a = 4.00;
        final double b = 4.50;
        final double c = 5.00;
        final double d = 2.00;
        final double e = 1.50;

        int choice = sc.nextInt();
        int quantity = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.printf("Total: R$ %.2f%n",(a*quantity));
                
                break;
            case 2:
            System.out.printf("Total: R$ %.2f%n",(b*quantity));
                
                break;
            case 3:
            System.out.printf("Total: R$ %.2f%n",(c*quantity));
                
                break;
            case 4:
            System.out.printf("Total: R$ %.2f%n",(d*quantity));
                
                break;
            case 5:
            System.out.printf("Total: R$ %.2f%n",(e*quantity));
                
                break;
        
            default:
                break;
        }

        // System.out.printf("Total : R$ %.2f%n",);
    }
}