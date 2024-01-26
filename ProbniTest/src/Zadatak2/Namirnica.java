package Zadatak2;

public class Namirnica {
    private double cena;
    private String naziv;

    @Override
    public String toString() {
        return "Namirnica{" +
                "cena=" + cena +
                ", naziv='" + naziv + '\'' +
                '}';
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Namirnica(double cena, String naziv) {
        this.cena = cena;
        this.naziv = naziv;
    }


}
