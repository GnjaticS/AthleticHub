package SedmiZadatak;

public class Pesma {
    private int brojPregleda;
    private String naziv;

    public Pesma(int brojPregleda, String naziv) {
        this.brojPregleda = brojPregleda;
        this.naziv = naziv;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    public void setBrojPregleda(int brojPregleda) {
        this.brojPregleda = brojPregleda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Pesma{" +
                "brojPregleda=" + brojPregleda +
                ", naziv='" + naziv + '\'' +
                '}';
    }

}
