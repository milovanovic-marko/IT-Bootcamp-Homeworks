/*
* D_10_Marko_Milovanović_ITBG16007
* */
public class SefSmene extends Radnik {
    private double nedeljniBonus;

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    public SefSmene(String ime, double radnihSati, double satnica, double nedeljniBonus) {
        super(ime, radnihSati, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public double ukupnoZaradjeno(){
        return super.getRadnihSati() * super.getSatnica() + nedeljniBonus;
    }

    @Override
    public void radnikNaOdmoru(double radnihSati) {
        if (radnihSati > 50) {
            System.out.println("Sef smene je na odmoru");
        } else {
            System.out.println("Sef smene nije na odmoru");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sef smene ").append(super.getIme()).append(" ima ").append(super.getRadnihSati()).append(" radnih sati i njegova satnica iznosi ").append(super.getSatnica());
        sb.append(" dinara.").append("\nNedeljni bonus iznosi: ").append(nedeljniBonus).append(" dinara.");
        sb.append("\nUkupno je zaradio: ").append(ukupnoZaradjeno()).append(" dinara.");
        return sb.toString();
    }
}
