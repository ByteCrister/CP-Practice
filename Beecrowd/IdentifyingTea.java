import java.util.Scanner;

public class IdentifyingTea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == T) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}
