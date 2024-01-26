import java.util.ArrayList;

public class KafanskiPevac extends muzicar {
    public KafanskiPevac(ArrayList<Album> listaAlbuma) {
        super(listaAlbuma);
    }

    @Override
    public void zarada() {
        int zarada = ukupnoPregleda()*500;
    }
}
