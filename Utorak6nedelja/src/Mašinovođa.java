public class Mašinovođa extends Radnik {

    private boolean osiguranje;

    public Mašinovođa (int a, int b, int c, boolean d) {
        super(a, b, c);
        this.osiguranje = d;

    }
    public boolean getOsiguranje () {
        return osiguranje;
    }
    public void setOsiguranje (boolean novoOsiguranje) {
        this.osiguranje = novoOsiguranje;
    }
    @Override
    public double ukupno () {
        double UkupnaPlata = staz() * 12;
        return UkupnaPlata * plata;
    }

}
