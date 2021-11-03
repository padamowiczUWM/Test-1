package pl.edu.uwm.wmii.adamowiczpatryk.test1;

import java.util.Random;
import java.util.Scanner;

public class z2 {
    private static int findMin(int[] tab) {
        int minEl = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minEl) {
                minEl = tab[i];
            }
        }

        return minEl;
    }

    private static int valueCountInTab(int[] tab, int n) {
        int _count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                _count++;
            }
        }

        return _count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ilość liczb: ");
        int n = in.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            Random r = new Random();

            tab[i] = r.nextInt(50 + 50) - 50;
        }

        int minValue = findMin(tab);
        System.out.format("Najmniejszy element: %d, występuje on %d razy.", minValue, valueCountInTab(tab, minValue));
    }
}
