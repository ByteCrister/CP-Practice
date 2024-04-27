import java.util.Scanner;

/************* Running  ***********/
public class MEXanizedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        boolean isValid = false;
        int sum = 0, number = 0;

        while (cases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            while (n-- > 0) {
                if (number != k && number <= x) {
                    number++;
                    sum += number;
                }
            }
        }
    }
}
