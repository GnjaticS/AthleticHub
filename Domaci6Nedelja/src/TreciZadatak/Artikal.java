package TreciZadatak;

public abstract class Artikal {
    private String naziv;
    private int cena;
    private int dostuponost;

    public Artikal(String naziv, int cena, int dostuponost) {
        this.naziv = naziv;
        this.cena = cena;
        this.dostuponost = dostuponost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getDostuponost() {
        return dostuponost;
    }

    public void setDostuponost(int dostuponost) {
        this.dostuponost = dostuponost;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", dostuponost=" + dostuponost +
                '}';
    }
    // Definisati apstraktnu metodu izracunajUkupnuCenu koju je potrebno implmentirati u svakoj od klasa koje nasleđuju apstraktnu
    public abstract double  ukupnaCena ();
}
