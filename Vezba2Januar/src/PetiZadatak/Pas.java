package PetiZadatak;

public class Pas extends Životinja{
    public Pas(int godina, boolean sisar) {
        super(godina, sisar);
    }

    @Override
    public void zvukŽivotinje() {
        System.out.println("Životinja se oglašava sa av-av");
    }
}
