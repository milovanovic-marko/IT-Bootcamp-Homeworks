/*
* D_10_Marko_Milovanović_ITBG16007
* */
public class Masinovodja extends Radnik {

    public Masinovodja(String ime, double radnihSati, double satnica) {
        super(ime, radnihSati, satnica);
    }

    public Masinovodja() {
    }

    @Override
    public void radnikNaOdmoru(double radnihSati) {
        if (radnihSati > 30) {
            System.out.println("Masinovodja je na odmoru");
        } else {
            System.out.println("Masinovodja nije na odmoru");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masinovodja ").append(super.getIme()).append(" ima ").append(super.getRadnihSati()).append(" radnih sati i njegova satnica iznosi ").append(super.getSatnica());
        sb.append(". \nUkupno je zaradio: ").append(ukupnoZaradjeno()).append(" dinara.");
        return sb.toString();
    }

}
