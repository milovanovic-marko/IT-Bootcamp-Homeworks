/*
* D_05_Marko_Milovanović_ITBG16007
*
*Zadatak 2:
Definisati dva jednaka niza brojeva, kao rezultat vratiti niz gde ce se sabrati svi elementi sa istim indeksima.1
* */

public class Zadatak2 {
    static int[] sabiranjeNizova(int[] niz1, int[] niz2) {
        if (niz1.length != niz2.length) {
            System.out.println("Nizovi nisu iste duzine!");
            return null;
        } else {
            int[] niz3 = new int[niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                niz3[i] = niz1[i] + niz2[i];
            }
            return niz3;
        }
    }

    static void printArray(int[] niz) {
        System.out.print("[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]\n");
            }
        }
    }
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4};
        int[] niz2 = {5, 6, 7, 8};
        int[] niz3 = {9, 10};

        int[] niz4 = sabiranjeNizova(niz1, niz2);
        printArray(niz4);
        int[] niz5 = sabiranjeNizova(niz2, niz3);
    }
}
