package TreciZadatak;

public class Hrana extends Artikal {
    public int rokTrajanja;
    public Hrana(String naziv, int cena, int dostuponost, int rokTrajanja) {
        super(naziv, cena, dostuponost);
        this.rokTrajanja = rokTrajanja;

    }

    @Override
    public double ukupnaCena() {
        if(rokTrajanja<=0)
            return getCena()/2.0;

        return getCena();
    }

}
