/*
* D_12_Marko_Milovanović_ITBG16007
* */
import java.util.ArrayList;

public class Automobil extends MotornoVozilo {

    public Automobil(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje, int brojTockova) {
        super(tockovi, cena, godinaProizvodnje, brojTockova);
    }

    public Automobil() {
    }

    @Override
    public void daLiJeOstecen() {
        for (Tocak i : getTockovi()) {
            if (i.getGumaTraje() > 365) {
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
