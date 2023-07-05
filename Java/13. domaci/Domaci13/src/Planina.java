/*
* D_13_Marko_Milovanović_ITBG16007
* */
public class Planina {
    private String nazivPlanine;
    private double visina;

    public Planina(String nazivPlanine, double visina) {
        this.nazivPlanine = nazivPlanine;
        postaviVisinu(visina);
    }

    public Planina() {
        this.nazivPlanine = "";
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        postaviVisinu(visina);
    }

    private void postaviVisinu(double visina) {
        this.visina = visina < 0 ? 0 : visina;
    }

    @Override
    public String toString() {
        return "Planina " + nazivPlanine + " je visoka " + visina + " m.";
    }
}
