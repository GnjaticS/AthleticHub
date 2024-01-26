package ŠestiZadatak;

public class Serije extends MedijskiSadžaj{

    private int brojSezona;
    private String reditelj;
    public Serije(String naslov, int godinaIzdanja, String žanr, String reditelj, int brojSezona) {
        super(naslov, godinaIzdanja, žanr);
        this.reditelj = reditelj;
        this.brojSezona = brojSezona;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + brojSezona + ", " + reditelj;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println(this.toString());
    }
}
