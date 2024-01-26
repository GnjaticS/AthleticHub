import java.util.ArrayList;

public class RokZvezda extends muzicar{
    public RokZvezda(ArrayList<Album> listaAlbuma) {
        super(listaAlbuma);

    }
// Klasa RokZvezda nasledjuje klasu Muzicar i on zaradjuje 100e po svakom svom pregledu.


    @Override
    public void zarada() {
        int zarada = ukupnoPregleda()*100;
        System.out.println("Ukupna zarada za ovu rok zvezdu je: " + zarada);
    }
}
