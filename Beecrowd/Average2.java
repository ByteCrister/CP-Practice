import java.util.Scanner;

class Average2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double avg = ((A*2)+(B*3)+(C*5))/(2+3+5);
        System.out.printf("MEDIA = %.1f%n",avg);
    }
}