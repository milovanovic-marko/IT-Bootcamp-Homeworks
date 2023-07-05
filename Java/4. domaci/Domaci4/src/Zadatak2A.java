/*
 * D_04_Marko_Milovanović_ITBG16007
 */
public class Zadatak2A {
    public static void main(String[] args) {
        int [] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("[");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                niz[i]++;
            }

            // uslovi za lepsi ispis rezultata
            if (i == niz.length - 1) {
                System.out.print(niz[i] + "]");
            } else {
                System.out.print(niz[i] + ", ");
            }
        }
    }
}
