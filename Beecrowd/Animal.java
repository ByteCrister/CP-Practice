import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stage1 = sc.nextLine();
        String stage2 = sc.nextLine();
        String stage3 = sc.nextLine();

        if (stage1.equals("vertebrado")) {
            if (stage2.equals("ave")) {
                if (stage3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (stage3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }

            }

        } else {
            if (stage2.equals("inseto")) {
                if (stage3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else {
                if (stage3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }

            }

        }
    }
}
