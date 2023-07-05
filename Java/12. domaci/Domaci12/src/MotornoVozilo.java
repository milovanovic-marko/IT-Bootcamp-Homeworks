/*
* D_12_Marko_Milovanović_ITBG16007
* */
import java.util.ArrayList;

public abstract class MotornoVozilo {

    private ArrayList<Tocak> tockovi;
    private double cena;
    private int godinaProizvodnje;

    private int brojTockova; // potreban broj tockova na svakom kamionu

    public ArrayList<Tocak> getTockovi() {
        return tockovi;
    }

    public void setTockovi(ArrayList<Tocak> tockovi) {
        this.tockovi = tockovi;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getBrojTockova() {
        return brojTockova;
    }

    public void setBrojTockova(int brojTockova) {
        this.brojTockova = brojTockova;
    }

    public MotornoVozilo(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje, int brojTockova) {
        this.tockovi = tockovi;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojTockova = brojTockova;
    }

    public MotornoVozilo() {
    }

    public abstract void daLiJeOstecen();

    public abstract void removeOstecenu();

    public abstract void ubaciRezervnu();

    public int brojRezervnihGuma() {
        return brojTockova % 2 == 0 ? brojTockova / 2 : brojTockova / 2 + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vozilo treba da ima ").append(brojTockova).append(" tockova, a trenutno poseduje ").append(tockovi.size()).append(" tockova. ");
        sb.append("Cena vozila je ").append(cena).append(" dinara, a godina proizvodnje je ").append(godinaProizvodnje);
        return sb.toString();
    }
}
