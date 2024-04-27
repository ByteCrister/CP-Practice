import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        String words[] = new String[s];
        for(int i=0; i<words.length; i++){
            words[i] = sc.next();
        }
        for(int i=0; i<words.length; i++){
            if(words[i].length()>10){
                System.out.println(words[i].charAt(0)+""+(words[i].length()-2)+""+words[i].charAt(words[i].length()-1));
            }else{
                System.out.println(words[i]);
            }
        }
    }
}
