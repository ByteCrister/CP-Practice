import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int problems = sc.nextInt();
        int participants = 3;
        int input;
        int zero=0;
        int one=0;
        int output=0;

        while (problems-- >0) {
            while(participants-- >0){
                input = sc.nextInt();
                if(input==0){
                    zero++;
                }else{
                    one++;
                }
            }

            if(one>zero){
                output++;
            }
            participants = 3 ;
            one=0;
            zero=0;

        }

        System.out.println(output);
    }
}
