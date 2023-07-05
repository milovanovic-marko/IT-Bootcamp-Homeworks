/*
* D_10_Marko_Milovanović_ITBG16007
* */
public class Fizikalac extends Radnik {

    public Fizikalac(String ime, double radnihSati, double satnica) {
        super(ime, radnihSati, satnica);
    }

    public Fizikalac() {
    }

    @Override
    public void radnikNaOdmoru(double radnihSati) {
        if (radnihSati > 40) {
            System.out.println("Fizikalac je na odmoru");
        } else {
            System.out.println("Fizikalac nije na odmoru");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fizikalac ").append(super.getIme()).append(" ima ").append(super.getRadnihSati()).append(" radnih sati i njegova satnica iznosi ").append(super.getSatnica());
        sb.append(". \nUkupno je zaradio: ").append(ukupnoZaradjeno()).append(" dinara.");
        return sb.toString();
    }

}
