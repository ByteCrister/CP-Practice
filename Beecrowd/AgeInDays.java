import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageInDays = sc.nextInt();

        int anos, meses, dias;

        anos = ageInDays/365;
        meses = (ageInDays - (anos*365))/30;
        dias = ageInDays - ((365*anos)+(meses*30));
        System.out.println(anos +" ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias +" dia(s)");


    }
}
