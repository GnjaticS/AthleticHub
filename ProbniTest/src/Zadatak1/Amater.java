package Zadatak1;

import java.util.ArrayList;

public class Amater extends Maratonac{
    public Amater(int godine, ArrayList<Staza> listaStaza) {
        super(godine, listaStaza);
    }

    @Override
    public int humanitarnaAkcija() {
        return getListaStaza().size() * 1000;
    }
}
