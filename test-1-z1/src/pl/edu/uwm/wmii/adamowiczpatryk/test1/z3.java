package pl.edu.uwm.wmii.adamowiczpatryk.test1;

import java.util.Scanner;

public class z3 {
    private static String delete(String str, String substr) {
        StringBuffer sb = new StringBuffer("");

        boolean firstTime = true;
        for (int i = 0; i < str.length(); i++) {
            int end = i + substr.length();

            if(end > str.length()) {
                end = str.length();
            }

            System.out.format("%s\n", str.substring(i, end));
            if (!str.substring(i, end).equals(substr)) {
                sb.append(str.charAt(i));
            } else {
                if (firstTime) {
                    sb.append(str.charAt(i));
                    firstTime = false;
                } else {
                    i += substr.length() - 1;
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
