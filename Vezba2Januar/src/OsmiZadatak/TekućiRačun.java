package OsmiZadatak;

public class TekućiRačun extends BankovniRačun {
    // dozvoljeniMinus
    private int dozvoljeniMinus;
    public TekućiRačun(int brojRačuna, String vlasnik, int trenutnoStanje, int dozvoljeniMinus) {
        super(brojRačuna, vlasnik, trenutnoStanje);
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public int getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(int dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }
    // Implementiramo metodu izvrsiTransakciju za tekući račun koja omogućava izvršavanje transakcija na računu, uz
    // proveru dozvoljenog
    //minusa.


    @Override
    public void izvršiTransakciju(double iznos) {
        getDozvoljeniMinus();
    }
}
