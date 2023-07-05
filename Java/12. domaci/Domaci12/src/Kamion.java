/*
* D_12_Marko_Milovanović_ITBG16007
* */
import java.util.ArrayList;

public class Kamion extends MotornoVozilo {

    public Kamion(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje, int brojTockova) {
        super(tockovi, cena, godinaProizvodnje, brojTockova);
    }

    public Kamion() {
    }

    @Override
    public void daLiJeOstecen() {
        for (Tocak i : getTockovi()) {
            if (i.getGumaTraje() > 120) {
                i.setOstecenje(true);
            }
        }
    }

    @Override
    public void removeOstecenu() {
        for (int i = getTockovi().size() - 1; i >= 0 ; i--) {
            if (getTockovi().get(i).isOstecenje()) {
                getTockovi().remove(i);
            }
        }
    }

    @Override
    public void ubaciRezervnu() {
        int potrebnoTockova = getBrojTockova() + brojRezervnihGuma();
        int razlika = potrebnoTockova - getTockovi().size();
        if (potrebnoTockova > getTockovi().size()) {
            for (int i = 0; i < razlika; i++) {
                getTockovi().add(new Tocak());
            }
        }
    }
}
