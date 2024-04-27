import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();
        int MaiorAB = (a + b + (a * b * s * (a - b))) / 2;

        System.out.println(MaiorAB + " eh o maior");
    }
}
