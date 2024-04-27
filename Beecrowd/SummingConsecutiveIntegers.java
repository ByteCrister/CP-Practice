import java.util.Scanner;

public class SummingConsecutiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int sum=A, value=0;

        while (sc.hasNext()) {
            value = sc.nextInt();
            if(value >0){
                while (value-- >1) {
                    sum += (sum+1);
                }
                System.out.println(sum);
            }
        }
    }
}
