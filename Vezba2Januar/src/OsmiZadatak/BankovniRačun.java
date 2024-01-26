package OsmiZadatak;

public abstract class BankovniRačun {
    private int brojRačuna;
    private String vlasnik;
    private int trenutnoStanje;

    public BankovniRačun(int brojRačuna, String vlasnik, int trenutnoStanje) {
        this.brojRačuna = brojRačuna;
        this.vlasnik = vlasnik;
        this.trenutnoStanje = trenutnoStanje;
    }

    public int getBrojRačuna() {
        return brojRačuna;
    }

    public void setBrojRačuna(int brojRačuna) {
        this.brojRačuna = brojRačuna;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(int trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    @Override
    public String toString() {
        return "BankovniRačun{" +
                "brojRačuna=" + brojRačuna +
                ", vlasnik='" + vlasnik + '\'' +
                ", trenutnoStanje=" + trenutnoStanje +
                '}';
    }
    // Implementiramo apstraktan metod izvrsiTransakciju(double iznos)
    // koji će biti različito implementiran u konkretnim tipovima računa.

    public abstract void izvršiTransakciju (double iznos);
}
