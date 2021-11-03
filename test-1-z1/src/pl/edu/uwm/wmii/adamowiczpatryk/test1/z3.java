package pl.edu.uwm.wmii.adamowiczpatryk.test1;

import java.util.Scanner;

public class z3 {
    private static String delete(String str, String substr) {
        StringBuffer sb = new StringBuffer("");

        // "tekstusunusun"
        //  01234567889

        boolean firstTime = true;
        for (int i = 0; i < str.length(); i++) {
            int end = i + substr.length();

            if(end > str.length() - 1) {
                end = str.length() - 1;
            }

            if (!str.substring(i, end).equals(substr)) {
                sb.append(str.charAt(i));
            } else {
                if (firstTime) {
                    System.out.println(i);
                    sb.append(str.charAt(i));
                    firstTime = false;
                } else {
                    System.out.println(i);
                    i += substr.length();
                    System.out.println(i);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wpisz tekst: ");
        String str = in.next();

        System.out.format("Zwrócony tekst: %s", delete(str, "usun"));
    }
}
