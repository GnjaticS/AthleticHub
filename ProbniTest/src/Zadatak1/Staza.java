package Zadatak1;

public class Staza {
    private String naziv;
    private int dužina;

    public Staza(String naziv, int dužina) {
        this.naziv = naziv;
        this.dužina = dužina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDužina() {
        return dužina;
    }

    public void setDužina(int dužina) {
        this.dužina = dužina;
    }

    @Override
    public String toString() {
        return "Staza{" +
                "naziv='" + naziv + '\'' +
                ", dužina=" + dužina +
                '}';
    }

}
