import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Tocak t1 = new Tocak(10, false, 5000);
        Tocak t2 = new Tocak(125, false, 5000);
        Tocak t3 = new Tocak(205, false, 5000);
        Tocak t4 = new Tocak(400, false, 5000);

        Kamion k1 = new Kamion(new ArrayList<>(Arrays.asList(t1, t2, t3, t4)), 1000, 1989, 6);

        k1.daLiJeOstecen();
        k1.removeOstecenu();
        k1.ubaciRezervnu();
        System.out.println(k1.getTockovi());
        System.out.println(k1.getTockovi().size());

    }
}
