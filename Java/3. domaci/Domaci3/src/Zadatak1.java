/*
* D_03_Marko_Milovanović_ITBG16007
* */

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tekst = ""; // koristi se za cuvanje unetog teksta
        String indikatorIzlaza = ""; // pomocna promenljiva za utvrdjivanje uslova za izlazak iz petlje

        while (true) {
            // kako bi korsiniku bilo jasnije sta se od njega ocekuje, stavio sam da ispisuje tekst prilikom svakog unosa
            System.out.print("Unesite neki tekst ili \"stop\" za prekid programa: ");

            indikatorIzlaza = sc.nextLine();
            if ("stop".equalsIgnoreCase(indikatorIzlaza)) {
                break;
            }
            tekst += indikatorIzlaza + " ";
        }
        // rezultat
        System.out.println("*".repeat(tekst.length())); // ponavlja karakter * onoliko puta koliko ima karaktera u promenljuvoj "tekst"
        System.out.println(tekst);
        System.out.println("*".repeat(tekst.length()));
    }
}
