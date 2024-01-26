package Zadatak1;

public class StambeniObjekat {
    private String lokacija;
    private double kvadratura;
    private double cena;

    public StambeniObjekat(String lokacija, double kvadratura, double cena) {
        this.lokacija = lokacija;
        this.kvadratura = kvadratura;
        this.cena = cena;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "StambeniObjekat{" +
                "lokacija='" + lokacija + '\'' +
                ", kvadratura=" + kvadratura +
                ", cena=" + cena +
                '}';
    }
// cenaPoKvadratu() -> racuna cenu jednog kvadrata u stambenom objektu.
    public double cenaPoKvadratu() {
        double cenaKvadrata = cena / kvadratura;
        return cenaKvadrata;
    }
}
