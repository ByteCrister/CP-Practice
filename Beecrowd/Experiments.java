import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        int totals = 0;
        int C = 0, R = 0, S = 0;

        while (cases-- > 0) {
            int input = sc.nextInt();
            String inputStr = sc.next();

            if (inputStr.equals("C")) {
                C += input;
            } else if (inputStr.equals("R")) {
                R += input;
            } else {
                S += input;
            }
        }

        totals = C+R+S;
        System.out.println("Total: "+totals+" cobaias");
        System.out.println("Total de coelhos: "+C);
        System.out.println("Total de ratos: "+R);
        System.out.println("Total de sapos: "+S);

        System.out.printf("Percentual de coelhos: %.2f %% %n", (double)(C*100)/totals);
        System.out.printf("Percentual de ratos: %.2f %% %n", (double)(R*100)/totals );
        System.out.printf("Percentual de sapos: %.2f %% %n", (double)(S*100)/totals);

    }
}
