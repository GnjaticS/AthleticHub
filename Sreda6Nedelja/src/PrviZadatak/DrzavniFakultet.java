package PrviZadatak;

import java.util.ArrayList;

public class DrzavniFakultet extends Fakultet {
    public DrzavniFakultet(ArrayList<Ucenik> listaUcenika) {
        super(listaUcenika);
    }


    public int zarada() {
        return getListaUcenika().size()*1000;
    }
}
