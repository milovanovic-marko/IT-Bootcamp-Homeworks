/*
 * D_03_Marko_Milovanović_ITBG16007
 * */

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double racunFirme, brojRadnika, isplataSvakomRadniku;

        System.out.print("Unesite koliko novca ima na racunu firme u dinarima: ");
        racunFirme = sc.nextDouble();

        if (racunFirme < 0) {
            System.out.println("Greska! Uneli ste negativan broj!");
            System.exit(1);
        }

        System.out.print("Unesite koliko ima radniku u firmi: ");
        brojRadnika = sc.nextDouble();

        if (brojRadnika < 0) {
            System.out.println("Greska! Uneli ste negativan broj!");
            System.exit(1);
        }

        System.out.print("Unesite koliko novca treba isplatiti svakom radniku pojedinacno u dinarima: ");
        isplataSvakomRadniku = sc.nextDouble();

        if (isplataSvakomRadniku < 0) {
            System.out.println("Greska! Uneli ste negativan broj!");
            System.exit(1);
        }

        if (racunFirme - (brojRadnika * isplataSvakomRadniku) < 0 ) { // slucaj kada nije moguce isplatiti svim radnicima
            int isplaceniRadnici = 0; // brojac isplacenih radnika
            double privremenoStanjeNaRacunu = racunFirme; // pomocna promenljiva za racunanje

            while (true) {
                privremenoStanjeNaRacunu -= isplataSvakomRadniku;

                if (privremenoStanjeNaRacunu >= 0) {
                    racunFirme = privremenoStanjeNaRacunu;
                    isplaceniRadnici++;
                } else {
                    break;
                }
            }
            
            System.out.println("Ne mozete isplatiti svim radnicima novac! Imate novca da isplatite " + isplaceniRadnici + " radnika!");

        } else { // slucaj kada je moguce isplatiti scim radnicima
            racunFirme -= brojRadnika * isplataSvakomRadniku;
            System.out.println("Isplaceni su svi radnici!");
        }
        System.out.println("Na racunu firme je ostalo: " + racunFirme + " dinara");
    }
}
