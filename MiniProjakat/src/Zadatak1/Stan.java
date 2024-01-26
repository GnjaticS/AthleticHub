package Zadatak1;

public class Stan extends StambeniObjekat{
    private boolean terasa;
    public Stan(String lokacija, double kvadratura, double cena, boolean terasa) {
        super(lokacija, kvadratura, cena);
        this.terasa = terasa;

    }

    public boolean isTerasa() {
        return terasa;
    }

    public void setTerasa(boolean terasa) {
        this.terasa = terasa;
    }

    @Override
    public String toString() {
        return "Stan{" +
                "terasa=" + terasa +
                '}';
    }
}
