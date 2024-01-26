package SedmiZadatak;

import java.util.ArrayList;

public class KafanskiPevač extends Muzičar{

    public KafanskiPevač(ArrayList<Album> listaAlbuma) {
        super(listaAlbuma);
    }
    // Klasa KafanskiPevac nasledjuje klasu Muzicar i on zaradjuje 500e za svaki svoju pesmu.

    @Override
    public void zarada() {
        System.out.println("Ovaj kafanski baja zarađuje više od rokera i to: " + ukupnoPregleda()*500 + " evra!");
    }
}
