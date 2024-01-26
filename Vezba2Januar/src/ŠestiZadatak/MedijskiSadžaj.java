package ŠestiZadatak;

public abstract class MedijskiSadžaj {
    // naslov, godina izdanja i žanr.
    private String naslov;
    private int godinaIzdanja;
    private String žanr;

    public MedijskiSadžaj(String naslov, int godinaIzdanja, String žanr) {
        this.naslov = naslov;
        this.godinaIzdanja = godinaIzdanja;
        this.žanr = žanr;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getŽanr() {
        return žanr;
    }

    public void setŽanr(String žanr) {
        this.žanr = žanr;
    }

    @Override
    public String toString() {
        return "MedijskiSadžaj: " +
                "naslov='" + naslov + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                ", žanr='" + žanr + '\'' ;
    }
    public abstract void prikaziInformacije ();
}
