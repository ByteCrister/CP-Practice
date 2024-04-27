import java.util.Scanner;

public class PerfectlyImperfectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        boolean output;

        while(cases-- >0){
            int test = sc.nextInt();
            output=false;
            while(test-- >0){
                int input = sc.nextInt();
                if((int)Math.sqrt(input)* (int)Math.sqrt(input) != input){
                    output=true;
                }
            }
            if(output){
                System.out.println("YES");
            }else{
                System.out.println("NO");
               
            }
        }
    }
}
