import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sold = sc.nextDouble();
        double finalSalary = ((sold*15)/100)+salary;

        System.out.printf("TOTAL = R$ %.2f%n",finalSalary);
    }
}
