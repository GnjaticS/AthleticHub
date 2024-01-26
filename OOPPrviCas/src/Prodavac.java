public class Prodavac {
    String ime;
    String prezime;
    int godinaZaposlenja;

    public Prodavac (String ime, String prezime, int god) {
        this.ime= ime;
        this.prezime= prezime;
        this.godinaZaposlenja = god;
    }
    public int radniStaz () {
        int rezultat = 2023 - godinaZaposlenja;
        return rezultat;
    }
    public String toString() {
        return "Ime zaposlenog je " + ime + " " + prezime + ", a njegove godine staza su: " + radniStaz();
    }

}
