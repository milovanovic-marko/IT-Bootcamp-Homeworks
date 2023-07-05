/*
* D_05_Marko_Milovanović_ITBG16007
*
* Zadatak 1:
* Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu.
* Zadatak 3: Definisati neki niz imena. Uneti ime preko Scannera koje ce vratiti poruku ukoliko se uneto ime nalazi u nizu.
* */

import java.util.Scanner;

public class Zadatak1 {
    static void daLiSePonavlja(Scanner sc, String[] niz) {
        System.out.print("Unesi neko ime: ");
        String ime = sc.nextLine().trim();

        int brojPonavljanja = 0;
        boolean uNizu = false;

        for (String i : niz) {
            if (i.equalsIgnoreCase(ime)) {
                brojPonavljanja++;
                uNizu = true;
            }
        }
        if (uNizu) {
            System.out.println("Ime " + ime + " postoji u nizu i pojavljuje se " + brojPonavljanja + " puta");
        } else {
            System.out.println("Ime " + ime + " ne postoji u nizu.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] niz = {"Stefan", "Bojan", "Radomir", "Jovana", "Bojana", "Mateja", "Mateja"};

        daLiSePonavlja(sc, niz);
    }
}
