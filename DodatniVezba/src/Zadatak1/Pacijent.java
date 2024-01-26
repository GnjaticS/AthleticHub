package Zadatak1;

public class Pacijent {
    private String ime;
    private int brojGodina;
    private String dijagnoza;

    public Pacijent(String ime, int brojGodina, String dijagnoza) {
        this.ime = ime;
        this.brojGodina = brojGodina;
        this.dijagnoza = dijagnoza;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    @Override
    public String toString() {
        return "Pacijent{" +
                "ime='" + ime + '\'' +
                ", brojGodina=" + brojGodina +
                ", dijagnoza='" + dijagnoza + '\'' +
                '}';
    }

}
