import java.util.Scanner;

/**************** time limit exceed *****************/
public class AndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i = 5&4;
        // System.out.println(i&3);
        // System.out.println(6&3);

        long caseLimit = 3 * (long) Math.pow(10, 4);
        long inputLimit = (long) Math.pow(10, 9);
        // System.out.println(inputLimit);

        long cases = sc.nextLong();
        if (cases >= 1 && (cases <= caseLimit)) {
            while (cases-- > 0) {
                long n = sc.nextLong();
                long max = n;
                if (n >= 1 && (n <= inputLimit)) {
                    while (n-- > 0) {
                        max &= n;
                        // System.out.println("max "+max);
                        if (max == 0) {
                            System.out.println(n);
                            break;
                        }
                    }
                }
            }
        }
    }
}
