import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        if (startHour >= endHour) {
            if(startHour==endHour){
                endHour+=24;
                
            }else{
                
                endHour+=24;
            }
            int startHoursInSeconds = (startHour * 3600) + (startMinute * 60);
            int endHoursInSeconds = (endHour * 3600) + (endMinute * 60);

            int totalSeconds = endHoursInSeconds - startHoursInSeconds;
            int totalHours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds - (totalHours * 3600)) / 60;
            // System.out.println(totalHours);
            // System.out.println(totalMinutes);
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
            
        } else {
            int startHoursInSeconds = (startHour * 3600) + (startMinute * 60);
            int endHoursInSeconds = (endHour * 3600) + (endMinute * 60);

            int totalSeconds = endHoursInSeconds - startHoursInSeconds;
            int totalHours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds - (totalHours * 3600)) / 60;
            // System.out.println(totalHours);
            // System.out.println(totalMinutes);
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");

        }
    }
}
