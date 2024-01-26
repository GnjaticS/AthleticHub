package PetiZadatak;

public class Mačka extends Životinja{
    public Mačka(int godina, boolean sisar) {
        super(godina, sisar);
    }

    @Override
    public void zvukŽivotinje() {
        System.out.println("Životinja se oglašava sa mjau-mjau");
    }
}
