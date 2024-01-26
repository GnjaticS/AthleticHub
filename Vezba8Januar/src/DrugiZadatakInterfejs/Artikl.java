package DrugiZadatakInterfejs;

public class Artikl {
    private String naziv;
    private double cena;

    public Artikl(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }


}
