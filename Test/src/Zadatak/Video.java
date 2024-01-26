package Zadatak;

public class Video {
    private String naziv;
    private int brPregleda;
    private int brLajkova;

    public Video(String naziv, int brPregleda, int brLajkova) {
        this.naziv = naziv;
        this.brPregleda = brPregleda;
        this.brLajkova = brLajkova;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrPregleda() {
        return brPregleda;
    }

    public void setBrPregleda(int brPregleda) {
        this.brPregleda = brPregleda;
    }

    public int getBrLajkova() {
        return brLajkova;
    }

    public void setBrLajkova(int brLajkova) {
        this.brLajkova = brLajkova;
    }

    @Override
    public String toString() {
        return "Video{" +
                "naziv='" + naziv + '\'' +
                ", brPregleda=" + brPregleda +
                ", brLajkova=" + brLajkova +
                '}';
    }
}
