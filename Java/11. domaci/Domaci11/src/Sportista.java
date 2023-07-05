/*
* D_11_Marko_Milovanović_ITBG16007
* */
public class Sportista {
    private String ime;
    private long jmbg;
    private double plata;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        postaviJmbg(jmbg);
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    private void postaviJmbg(long jmbg) {
        if (String.valueOf(jmbg).length() != 13) {
            System.out.println("JMBG nije validan");
        } else {
            this.jmbg = jmbg;
        }
    }

    public Sportista(String ime, long jmbg, double plata) {
        this.ime = ime;
        postaviJmbg(jmbg);
        this.plata = plata;
    }

    public Sportista() {
        this.ime = "";
    }

    @Override
    public String toString() {
        return ime + " sa jmbg-om: " + jmbg + " ima platu koja iznosi: " + plata + " dinara";
    }
}
