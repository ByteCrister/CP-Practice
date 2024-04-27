import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        if (testCases >= 1 && testCases <= 1000) {
            while (testCases-- > 0) {
                int length = sc.nextInt();
                String string = sc.next(), previousString = "";
                boolean isSuspicious = false;

                int startIndex = 0, endIndex = 0, index = 1;

                if (length >= 1 && length <= 50) {
                    previousString = (String.valueOf(string.charAt(0)));

                    while (string.length() > index) {
                        if (previousString.equals(String.valueOf(string.charAt(index)))) {
                            // System.out.println("previous "+previousString+", "+string.charAt(index+1)+"
                            // index "+(index+1));
                            index++;
                            // System.out.println("index "+index);
                        } else {
                            // System.out.println(string.charAt(index));
                            // System.out.println("else " + string.charAt(index) + " index " + (index));
                            previousString = String.valueOf(string.charAt(index));
                            endIndex = index - 1;
                            // System.out.println("end " + endIndex);

                            while (endIndex >= startIndex) {
                                if (String.valueOf(string.charAt(index))
                                        .equals(String.valueOf(string.charAt(startIndex++)))) {
                                    isSuspicious = true;
                                    break;
                                }
                            }
                            startIndex = 0;
                            if (isSuspicious) {
                                break;
                            }
                            index++;
                        }
                    }
                }
                if (isSuspicious) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

    }
}
