/*
* D_12_Marko_Milovanović_ITBG16007
* */
public class Tocak {

    private int gumaTraje;

    private boolean ostecenje;

    private double cena;

    public int getGumaTraje() {
        return gumaTraje;
    }

    public void setGumaTraje(int gumaTraje) {
        this.gumaTraje = gumaTraje;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Tocak(int gumaTraje, boolean ostecenje, double cena) {
        this.gumaTraje = gumaTraje;
        this.ostecenje = ostecenje;
        this.cena = cena;
    }

    public Tocak() {
        this.gumaTraje = 0;
        this.ostecenje = false;
        this.cena = 1000;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guma je koriscena ").append(gumaTraje).append(" dana i ");
        if (ostecenje) {
            sb.append("ostecena je. ");
        } else {
            sb.append("nije ostecena. ");
        }
        sb.append("Cena iznosi: ").append(cena).append(" dinara.");
        return sb.toString();
    }
}
