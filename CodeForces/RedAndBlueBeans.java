import java.util.Scanner;

public class RedAndBlueBeans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long testCases = sc.nextInt();
        while (testCases-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            if (r > 0 && b > 0) {
                if (r > b) {
                    long t = r;
                    r = b;
                    b = t;
                }

                while (r > 0 && b > 0) {
                    
                    r-=1;
                    long minDeference=0;
                    while((++minDeference-1)<d && (b-minDeference)>0){
                        // System.out.println("Diff "+(minDeference)+" , "+(b-minDeference));

                    }
                    b-=minDeference;
                    
                    // System.out.println(r + " " + b);
                    if (r == 0)
                        break;
                }
                if (r == 0 && b == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }
}
