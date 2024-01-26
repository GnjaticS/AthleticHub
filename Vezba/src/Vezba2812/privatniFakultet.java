package Vezba2812;

import java.util.ArrayList;

public class privatniFakultet extends Fakultet {
    private ArrayList<Ucenik> josJedanUcenik;
    public privatniFakultet(ArrayList<Ucenik> listaUcenka, ArrayList<Ucenik> josJedanUcenik) {
        super(listaUcenka);
        this.josJedanUcenik = josJedanUcenik;


    }

    @Override
    public void zarada() {
        int zarada = getListaUcenka().size()*1400;
        System.out.println("Zarada privatnog fakulteta po studentu je: " + zarada);
    }
}
