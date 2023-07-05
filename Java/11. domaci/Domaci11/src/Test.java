/*
* D_11_Marko_Milovanović_ITBG16007
* */
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Sportista s1 = new Sportista("Marko", 1111111111111L, 100 );
        Sportista s2 = new Sportista("Jovan", 2222222222222L, 1150 );
        Sportista s3 = new Sportista("Bojan", 5555555555555L, 110 );
        Sportista s4 = new Sportista("Stojan", 6666666666666L, 2000);

        SportskiKlub sk1 = new SportskiKlub(new ArrayList<>(Arrays.asList(s1, s2, s3, s4)), "Beograd", 20_000);

        System.out.println(sk1.isplati());
        System.out.println(sk1.prosecnoPlaceni());
        sk1.removePreplaceni(new ArrayList<>(Arrays.asList(s1, s2, s3, s4)));
        System.out.println(sk1);
    }
}
