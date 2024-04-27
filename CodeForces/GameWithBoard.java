import java.util.Scanner;

/******************** shows wrong submission *******************/
public class GameWithBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        if (cases >= 1 && cases <= 99) {
            while (cases-- > 0) {
                int input = sc.nextInt();

                if (input >= 2 && input <= 100) {
                    System.out.println((input%2==0)?"Alice":"Bob");

                }
            }
        }
    }
}
