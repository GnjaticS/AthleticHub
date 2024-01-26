package PrviZadatak;

import java.util.ArrayList;

public class PrivatniFakultet extends Fakultet {
    public PrivatniFakultet(ArrayList<Ucenik> listaUcenika) {
        super(listaUcenika);
    }

    @Override
    public int zarada() {
        return getListaUcenika().size()*1400;
    }
}
