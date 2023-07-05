public class Test {

    public static void main(String[] args) {
        Radnik r = new Radnik("Marko", 20, 50);
        System.out.println(r);
        r.radnikNaOdmoru(r.getRadnihSati());
        System.out.println("........................");
        Radnik r2 = new Radnik("Nikola", 61, 50);
        System.out.println(r2);
        r.radnikNaOdmoru(r2.getRadnihSati());

        System.out.println("=====================");

        Masinovodja m = new Masinovodja("Petar", 20, 5);
        System.out.println(m);
        m.radnikNaOdmoru(m.getRadnihSati());
        System.out.println("........................");
        Masinovodja m2 = new Masinovodja("Dragan", 31, 5);
        System.out.println(m2);
        m2.radnikNaOdmoru(m2.getRadnihSati());

        System.out.println("=====================");

        Fizikalac f = new Fizikalac("Petar", 20, 5);
        System.out.println(f);
        f.radnikNaOdmoru(f.getRadnihSati());
        System.out.println("........................");
        Fizikalac f2 = new Fizikalac("Dragan", 41, 5);
        System.out.println(f2);
        f2.radnikNaOdmoru(f2.getRadnihSati());

        System.out.println("=====================");

        SefSmene s = new SefSmene("Petar", 20, 5, 10);
        System.out.println(s);
        s.radnikNaOdmoru(s.getRadnihSati());
        System.out.println("........................");
        SefSmene s2 = new SefSmene("Dragan", 51, 5, 10);
        System.out.println(s2);
        s2.radnikNaOdmoru(s2.getRadnihSati());
    }
}
