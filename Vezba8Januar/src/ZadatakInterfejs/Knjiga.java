package ZadatakInterfejs;

public class Knjiga {
    private String naslov;
    private int brStrana;
    private double cena;
    private String žanr;

    public Knjiga(String naslov, int brStrana, double cena, String žanr) {
        this.naslov = naslov;
        this.brStrana = brStrana;
        this.cena = cena;
        this.žanr = žanr;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrStrana() {
        return brStrana;
    }

    public void setBrStrana(int brStrana) {
        this.brStrana = brStrana;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getŽanr() {
        return žanr;
    }

    public void setŽanr(String žanr) {
        this.žanr = žanr;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", brStrana=" + brStrana +
                ", cena=" + cena +
                ", žanr='" + žanr + '\'' +
                '}';
    }
}
