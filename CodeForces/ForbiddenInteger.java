import java.util.LinkedList;
import java.util.Scanner;

/************** running  ****************/
public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        while (cases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;

            LinkedList<Integer>list = new LinkedList<>();
            while (sum!=n) {
                if(k==1 && x==1){
                    System.out.println("NO");
                    break;
                }else if(k==x){
                    sum+=k-1;
                }else{
                    sum+=k;
                }
            }
        }
    }
}
