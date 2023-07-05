/*
*
* D_06_Marko_Milovanović_ITBG16007
*
b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni.
*
* */

public class Zadatak2 {

    static void paranNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
          if (niz[i] % 2 != 0) {
                niz[i]++;
          }
        }
    }

    static void printArray(int[] niz) {
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
        int[] niz = {2, 3, 1, 6, 8, 11};

        paranNiz(niz);
        printArray(niz);
    }
}
