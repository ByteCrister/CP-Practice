import java.util.Scanner;

public class efficientRedAndBlueBeans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            long minBeans = Math.min(r, b);
            long maxBeans = Math.max(r, b);

            // Calculate the maximum number of beans that can be removed in a single step
            long maxRemove = (minBeans * (d + 1));

            // Check if it's possible to distribute all beans
            if (maxRemove >= maxBeans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
