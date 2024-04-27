import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds - (3600*hours))/60;
        int Seconds = (seconds - ((3600*hours) + (minutes*60)));
        // System.out.println(hours);
        // System.out.println(minutes);
        // System.out.println(Seconds);
        System.out.println(hours+":"+minutes+":"+Seconds);
    }
}
