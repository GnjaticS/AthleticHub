package SedmiZadatak;

import java.util.ArrayList;

public class RokZvezda extends Muzičar{
    public RokZvezda(ArrayList<Album> listaAlbuma) {
        super(listaAlbuma);
    }
    // Klasa RokZvezda nasledjuje klasu Muzicar i on zaradjuje 100e po svakom svom pregledu.


    @Override
    public void zarada() {
        System.out.println("Ukupna zarada ovog muzičara je: " + ukupnoPregleda()*100);
    }
}
