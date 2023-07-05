import java.util.ArrayList;
import java.util.List;

/*
* D_07_Marko_Milovanović_ITBG16007
* 
* Napraviti dve funkcije:
* a) Prva funkcija kreira listu od 20 parnih brojeva.
* b) Druga funkcija uzima listu iz primera a) i eleminise sve brojeve koji su deljivi sa 4.
* */
public class Zadatak1 {

    // a)
    static List<Integer> napraviListu() {
        List<Integer> lista = new ArrayList<>(20);
        int brojElemenata = 20;
        for (int i = 1; brojElemenata > 0; i++) {
            if (i % 2 == 0) {
                lista.add(i);
                brojElemenata--;
            }
        }
        return lista;
    }

    // b)
    static void brisiBrojeve(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 4 == 0) {
                lista.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = napraviListu();
        System.out.println(lista);
        brisiBrojeve(lista);
        System.out.println(lista);
    }
}
