import java.util.Scanner;

public class PhoenixAndGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long cases = sc.nextLong();
        while (cases-- > 0) {
            long inputs = sc.nextLong();
            long avoidWeight = sc.nextLong();
            long sum = 0;
            int i = 0;
            long weights[] = new long[(int) inputs];
            while (inputs-- > 0) {
                weights[i++] = sc.nextLong();
                sum += weights[i - 1];

            }
            // System.out.println(sum);
            if (sum == avoidWeight) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int j = weights.length - 1; j >= 0; j--) {
                    System.out.print(weights[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
