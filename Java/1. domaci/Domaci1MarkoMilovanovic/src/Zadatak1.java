import java.time.Year;

public class Zadatak1 {

    public static void main(String[] args) {
        String ime = "Petar";
        String prezime = "Petrovic";
        int godinaRodjenja = 1980;
        int godinaZaposlenja = 2000;
        int trenutnaGodina = Year.now().getValue(); // uzimam tekucu godinu

        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Godine radnog staza: " + (trenutnaGodina - godinaZaposlenja));
    }

}
