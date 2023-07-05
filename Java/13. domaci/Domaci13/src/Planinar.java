/*
 * D_13_Marko_Milovanović_ITBG16007
 * */
import java.util.ArrayList;
import java.util.Arrays;

public class Planinar implements Planinarenje {

    private ArrayList<Planina> planineNaKojeSePopeo;
    private double maksimalniUspon;
    private double tezinaOpreme;

    public Planinar(ArrayList<Planina> planineNaKojeSePopeo, double maksimalniUspon, double tezinaOpreme) {
        this.planineNaKojeSePopeo = new ArrayList<>();
        postaviPlanineNaKojeSePopeo(planineNaKojeSePopeo);
        postaviMaksimalniUspon(maksimalniUspon);
        postaviTezinuOpreme(tezinaOpreme);
    }

    public Planinar (double maksimalniUspon, double tezinaOpreme, Planina... planineNaKojeSePopeo) {
        this.planineNaKojeSePopeo = new ArrayList<>();
        this.planineNaKojeSePopeo.addAll(Arrays.asList(planineNaKojeSePopeo));
        postaviMaksimalniUspon(maksimalniUspon);
        postaviTezinuOpreme(tezinaOpreme);
    }

    public ArrayList<Planina> getPlanineNaKojeSePopeo() {
        return planineNaKojeSePopeo;
    }

    public void setPlanineNaKojeSePopeo(ArrayList<Planina> planineNaKojeSePopeo) {
        postaviPlanineNaKojeSePopeo(planineNaKojeSePopeo);
    }

    public double getMaksimalniUspon() {
        return maksimalniUspon;
    }

    public void setMaksimalniUspon(double maksimalniUspon) {
        postaviMaksimalniUspon(maksimalniUspon);
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        postaviTezinuOpreme(tezinaOpreme);
    }

    private void postaviTezinuOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme < 0 ? 0 : tezinaOpreme;
    }

    private void postaviMaksimalniUspon(double maksimalniUspon) {
        this.maksimalniUspon = maksimalniUspon < 0 ? 0 : maksimalniUspon;
    }

    private void postaviPlanineNaKojeSePopeo(ArrayList<Planina> planineNaKojeSePopeo) {
        this.planineNaKojeSePopeo.addAll(planineNaKojeSePopeo);
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() < maksimalniUspon) {
            this.planineNaKojeSePopeo.add(p);
        }
    }

    @Override
    public double clanarina() {
        double popust = planineNaKojeSePopeo.size() * 0.02;
        return popust >= 100 ? 0 : 1000 * (1 - popust);
    }

    @Override
    public double sviUsponi() {
        double sum = 0;
        for (Planina i : planineNaKojeSePopeo) {
            sum += i.getVisina();
        }
        return sum;
    }

    @Override
    public String najvecaPlanina() {
        Planina najveca = new Planina("", Double.NEGATIVE_INFINITY);
        for (Planina i : planineNaKojeSePopeo) {
            if (najveca.getVisina() < i.getVisina()) {
                najveca = i;
            }
        }
        return najveca.getNazivPlanine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planiar nosi teret od ").append(tezinaOpreme).append(" kg i moze da se popne na maksimalnu visinu od ").append(maksimalniUspon).append(" m.");
        sb.append("\nPlanine na koje se popeo su: ");
        for (Planina i : planineNaKojeSePopeo) {
            sb.append(i.getNazivPlanine()).append(" ");
        }
        return sb.toString();
    }
}

