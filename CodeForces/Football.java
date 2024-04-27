import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String output = "";
        int one = 0, zero = 0, i = 0, iO = 0, iZ = 0;
        int length = input.length();
        if (length <= 100) {
            while (length-- > 0) {
                if (input.charAt(i++) == '0') {
                    zero++;
                    iZ++;
                    one = 0;
            
                } else {
                    one++;
                    iO++;
                    zero = 0;
                    
                }
                if (zero >= 7 || one >= 7) {
                    output = "YES";
                }
            }
        }

        // System.out.println(iO+" "+iZ);
        if (iO != 0 && iZ != 0) {
            if (output.equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
