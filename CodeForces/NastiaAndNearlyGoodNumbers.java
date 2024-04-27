import java.util.Scanner;


/******************Not submitted *********/
public class NastiaAndNearlyGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cases = sc.nextLong();

        if (cases >= 1 && cases <= 10000) {
            while (cases-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();

                if ((a >= 1 && a <= (int) Math.pow(10, 6)) && (b >= 1 && b <= (int) Math.pow(10, 6))) {
                    if (b == 1) {
                        System.out.println("NO");
                    } else {
                        long x, y, z;
                        x = a;
                        y = a*(b-1);
                        z = a*b;
                        if(z==(x+y)){
                            System.out.println("YES");
                            System.out.println(""+x+" "+y+" "+z);
                        }else{
                            System.out.println("NO");
                        }
                    }
                }

            }

        }
    }
}
