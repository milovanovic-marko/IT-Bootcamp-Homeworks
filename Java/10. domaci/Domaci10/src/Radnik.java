/*
* D_10_Marko_Milovanović_ITBG16007
* */
public class Radnik {
    private String ime;
    private double radnihSati;
    private double satnica;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getRadnihSati() {
        return radnihSati;
    }

    public void setRadnihSati(double radnihSati) {
        this.radnihSati = radnihSati;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    public double ukupnoZaradjeno(){
        return radnihSati * satnica;
    }

    public void radnikNaOdmoru(double radnihSati) {
        if (radnihSati > 60) {
            System.out.println("Radnik je na odmoru");
        } else {
            System.out.println("Radnik nije na odmoru");
        }
    }

    public Radnik(String ime, double radnihSati, double satnica) {
        this.ime = ime;
        this.radnihSati = radnihSati;
        this.satnica = satnica;
    }

    public Radnik() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Radnik ").append(ime).append(" ima ").append(radnihSati).append(" radnih sati i njegova satnica iznosi ").append(satnica);
        sb.append(". \nUkupno je zaradio: ").append(ukupnoZaradjeno()).append(" dinara.");
        return sb.toString();
    }
}
