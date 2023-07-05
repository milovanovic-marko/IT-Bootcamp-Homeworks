/*
 * D_01_Marko_Milovanović_ITBG16007
 */

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double cenaRuza, cenaZumbul, cenaOrhideja, cenaBonzai;
        String imeCveta;

        cenaRuza = 50;
        cenaZumbul = cenaRuza + 20;
        cenaOrhideja = cenaZumbul * 2.5;
        cenaBonzai = cenaOrhideja * 3;

        System.out.print("Unesite ime cveta (Ruza, Zumbul, Orhideja, Bonzai): ");
        imeCveta = sc.nextLine();
        imeCveta = imeCveta.trim(); // uklanjam beline ispred prve i iza poslednje reci
        imeCveta = imeCveta.toLowerCase(); // prevaram sva slova u mala

        if (imeCveta.equals("ruza")){
            System.out.println(" Imamo ruzu i cena ruze je: " + cenaRuza + " dinara");
        } else if (imeCveta.equals("zumbul")) {
            System.out.println("Imamo zumbul i cena zumbula je: " + cenaZumbul + " dinara");
        } else if (imeCveta.equals("orhideja")) {
            System.out.println("Imemo orhideju i cena orhideje je: " + cenaOrhideja + " dinara");
        } else if (imeCveta.equals("bonzai")) {
            System.out.println("Imamo bonzai i cena bonzaia je: " + cenaBonzai + " dinara");
        } else {
            System.out.println("Pogresan unos ili cvet nije na lageru!");
        }

    }

}
