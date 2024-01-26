package TrećiZadatak;

public class Pas extends Životinja{
    private String rasa;
    public Pas(String vrsta, String rasa) {
        super(vrsta);
        this.rasa = rasa;
    }

    @Override
    public void zvuk() {
        super.zvuk();
        System.out.println("Životinja pas proizvodi zvuk Av-av");
    }
    //Dodatno, klasa Pas ima i novu metodu donesiPalicu(), koja simulira akciju psa donošenja palice (ispisuje obican string
    //"pas donosi palicu").

    public void donesiPalicu () {
        System.out.println("Pas donosi palicu. ");
    }
}
