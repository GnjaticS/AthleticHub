package DrugiZadatak;

public class Planina {
    private int visina;
    private String naziv;

    public Planina(int visina, String naziv) {
        this.visina = visina;
        this.naziv = naziv;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "visina=" + visina +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
