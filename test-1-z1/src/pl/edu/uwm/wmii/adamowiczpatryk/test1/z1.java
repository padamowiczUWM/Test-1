package pl.edu.uwm.wmii.adamowiczpatryk.test1;

import java.util.Scanner;

public class z1 {

    private static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int j = 2; j < n/2; j++) {
            if(n%j == 0) {
                return false;
            }
        }

        return true;
    }

    private static int findPrimes(int[] list) {
        int _count = 0;


        for (int i = 0; i < list.length; i++) {
            if(isPrime(list[i])) {
                _count++;
            }
        }

        return _count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ilość wprowadzonych liczb: ");
        int n = in.nextInt();

        System.out.println("Wprowadź teraz liczby.");
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }

        System.out.format("Znaleziono %d liczb pierwszych.", findPrimes(list));
    }
}
