/*
* D_11_Marko_Milovanović_ITBG16007
* */
import java.util.ArrayList;

public class SportskiKlub {
    private ArrayList<Sportista> clanoviKluba;
    private String grad;
    private double budzet;

    public ArrayList<Sportista> getClanoviKluba() {
        return clanoviKluba;
    }

    public void setClanoviKluba(ArrayList<Sportista> clanoviKluba) {
        this.clanoviKluba = clanoviKluba;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    public SportskiKlub(ArrayList<Sportista> clanoviKluba, String grad, double budzet) {
        this.clanoviKluba = clanoviKluba;
        this.grad = grad;
        this.budzet = budzet;
    }

    public SportskiKlub() {
        this.clanoviKluba = new ArrayList<>();
        this.grad = "";
    }

    public double isplati() {
        for (Sportista i : clanoviKluba) {
            budzet -= i.getPlata(); // razumeo sam da u zadatku treba i da se promeni stanje na racunu
        }
        return budzet; // budzet moze biti negativan jer klub moze biti u dugovima
    }

    public double prosecnoPlaceni() {
        double sum = 0;
        for (Sportista i : clanoviKluba) {
            sum += i.getPlata();
        }
        return (double) sum / clanoviKluba.size();
    }

    /*public void removePreplaceni() {
        double prosecnaPlata = prosecnoPlaceni();
        for (int i = 0; i < clanoviKluba.size(); i++) {
            if (clanoviKluba.get(i).getPlata() > prosecnaPlata) {
                clanoviKluba.remove(i);
                i--;
            }
        }
    }*/

    public void removePreplaceni(ArrayList<Sportista> clanoviKluba) {
        double plata = prosecnoPlaceni();
        for (int i = clanoviKluba.size() - 1; i >= 0; i--) {
            Sportista trenutni = clanoviKluba.get(i);
            if ( trenutni.getPlata() > plata) {
                clanoviKluba.remove(trenutni);
                System.out.println("Uklonjeni su " + trenutni);
            }
        }
    }

    @Override
    public String toString() {
        return "Sportski klub iz " + grad + " ima " + clanoviKluba.size() + " clanova kluba i budzet od: " + budzet + " dinara";
    }
}
