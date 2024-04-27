import java.util.Scanner;

public class SumOf2050 {
    static long initialSum(long sum, long cases) {
        int i = 0;
        while (cases >= 2050 * Math.pow(10, i++) + sum) {

        }
        return 2050 * (long) Math.pow(10, i - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long input = sc.nextLong();
        int count = 0;
        long functionValue = 0, sum = 0;

        while (input-- > 0) {
            long cases = sc.nextLong();
            if (cases < 2050) {
                System.out.println(-1);
            } else {

                while (sum != cases) {
                    functionValue = initialSum(sum, cases);
                    sum += functionValue;
                    count++;
                }
                System.out.println(count);
                count = 0;
                functionValue = 0;
                sum = 0;

            }
        }
    }
}
