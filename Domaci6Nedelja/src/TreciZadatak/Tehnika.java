package TreciZadatak;

public class Tehnika extends Artikal{
    public int garancija;
    public Tehnika(String naziv, int cena, int dostuponost, int garancija) {
        super(naziv, cena, dostuponost);
        this.garancija = garancija;
    }

    @Override
    public double ukupnaCena() {

        return getCena()*1.1;
    }
}
