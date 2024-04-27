import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float number = sc.nextFloat();
        if (number >= 0.00 && number <= 100.00) {
            if(number>=0.00 && number<= 25.00){
                System.out.println("Intervalo [0,25]");
            }else if(number >25.00 && number <=50.00){
                System.out.println("Intervalo (25,50]");
            }else if(number >50.00 && number <=75.00){
                System.out.println("Intervalo (50,75]");
            }else{
                System.out.println("Intervalo (75,100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
