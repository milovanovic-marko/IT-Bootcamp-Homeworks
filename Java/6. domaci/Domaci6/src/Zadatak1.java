/*
* D_06_Marko_Milovanović_ITBG16007
*
* Domaci Zadatak 1:
a) Napraviti funkciju za ubacivanje celih brojeva u niz. U parametru metoda cemo imati broj koji predstavlja velicinu niza,
* unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.
*
* */

import java.util.Scanner;

public class Zadatak1 {

    static void kreirajNiz(int len, Scanner sc) {
        int[] niz = new int[len];
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite ceo broj: ");
            niz[i] = sc.nextInt();
        }

        System.out.print("\n Niz je: [");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kreirajNiz(5, sc);

    }
}
