package PrviZadatak;

public class Glumac {
    private String ime;
    private String prezime;
    private int godineIskustva;

    public Glumac(String ime, String prezime, int godineIskustva) {
        this.ime = ime;
        this.prezime = prezime;
        this.godineIskustva = godineIskustva;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godineIskustva=" + godineIskustva +
                '}';
    }
}
