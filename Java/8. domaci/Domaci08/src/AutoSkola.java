/*
* D_08_Marko_Milovanović_ITBG16007
*
* 1) Napraviti metodu koja ce dati svima koji polazu za motor 50% popusta od cene polaganja.
2) Napraviti metodu koja ce nam vratiti koliko grupa ce imati Auto-skola ako znamo da
grupa mora imati bar petoro ljudi.
3) Ukoliko korisnik zeli da polaze za Autobus, ispisati poruku da to nije moguce u ovom
trenutku, u suprotnom ispisati da je polaganje moguce.
4) Sve rezultujuce objekte ispisati pomocu toString().
* */
public class AutoSkola {
    String naziv;
    int brojLjudiUSkoli;
    double cenaPolaganja;
    String tipVozilaZaPolaganje;

    public String getNaziv() {
        return naziv;
    }

    public int getBrojLjudiUSkoli() {
        return brojLjudiUSkoli;
    }

    public double getCenaPolaganja() {
        return cenaPolaganja;
    }

    public String getTipVozilaZaPolaganje() {
        return tipVozilaZaPolaganje;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrojLjudiUSkoli(int brojLjudiUSkoli) {
        this.brojLjudiUSkoli = brojLjudiUSkoli;
    }

    public void setCenaPolaganja(double cenaPolaganja) {
        this.cenaPolaganja = cenaPolaganja;
    }

    public void setTipVozilaZaPolaganje(String tipVozilaZaPolaganje) {
        this.tipVozilaZaPolaganje = tipVozilaZaPolaganje;
    }

    public AutoSkola(String naziv, int brojLjudiUSkoli, double cenaPolaganja, String tipVozilaZaPolaganje) {
        this.naziv = naziv;
        this.brojLjudiUSkoli = brojLjudiUSkoli;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozilaZaPolaganje = tipVozilaZaPolaganje;
    }

    // 1)
    public void smanjiCenu() {
        if (getTipVozilaZaPolaganje().equalsIgnoreCase("Motor")) {
            setCenaPolaganja(getCenaPolaganja()*0.5);
        }
    }

    // 2)
    public int brojGrupa() {
        return getBrojLjudiUSkoli() / 5;
    }

    // 3)
    public void polaganjeZaAutobus() {
        if (getTipVozilaZaPolaganje().equalsIgnoreCase("Autobus")) {
            System.out.println("Polaganje nije moguce u ovom trenutku");
        } else {
            System.out.println("Polaganje je moguce");
        }
    }

    // 5)
    @Override
    public String toString() {
        return  "=============================================================" + "\n" +
                "Naziv skole je " + naziv + "\n" +
                "Broj ljudi u skoli je " + brojLjudiUSkoli + "\n" +
                "Cena polaganja je " + cenaPolaganja + "\n" +
                "Tip vozila za polaganje je " + tipVozilaZaPolaganje + "\n" +
                "=============================================================";
    }
}
