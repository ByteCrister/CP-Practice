import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digits=0, sums=0, input=0;
        while(1>0){
            input = sc.nextInt();
            if(input<0){
                break;
            }else{
                digits++;
                sums+=input;
            }
            
        }
        double avg = (double)((double)sums/digits);
        System.out.printf("%.2f%n", avg);
    }
}
