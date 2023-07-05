/*
 * D_04_Marko_Milovanović_ITBG16007
 */

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Greska! Broj je negativan ili je nula!");
        }

        for (int i = 1; i < n; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + ": FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
