package Vezba2812;

import java.util.ArrayList;

public class DrzavniFakultet extends Fakultet {
    public DrzavniFakultet(ArrayList<Ucenik> listaUcenka) {
        super(listaUcenka);
    }

    @Override
    public void zarada() {
        int zarada = getListaUcenka().size()*1000;
        System.out.println("Zarada državnog fakulteta po studentu je " + zarada);
    }
}
