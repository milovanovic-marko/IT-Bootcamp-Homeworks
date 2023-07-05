/*
* D_02_Marko_Milovanović_ITBG16007
* */

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double satnica, radniSati, plata;

        System.out.print("Unesite broj radnih sati: ");
        radniSati = sc.nextDouble();
        if (radniSati < 0) {
            System.out.println("Greska! Unesite pozitivan broj!");
            System.exit(1); // izlazi iz programa kada je unet neispravan podatak
        }

        System.out.print("Unesite vrednost satnice u dinarima: ");
        satnica = sc.nextDouble();
        if (satnica < 0) {
            System.out.println("Greska! Unesite pozitivan broj!");
            System.exit(1); // izlazi iz programa kada je unet neispravan podatak
        }

        plata = satnica * radniSati;
        System.out.println("Vasa plata je: " + plata + " dinara");
    }

}
