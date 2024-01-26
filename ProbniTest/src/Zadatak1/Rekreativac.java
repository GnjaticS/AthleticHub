package Zadatak1;

import java.util.ArrayList;

public class Rekreativac extends Maratonac{
    public Rekreativac(int godine, ArrayList<Staza> listaStaza) {
        super(godine, listaStaza);
    }

    @Override
    public int humanitarnaAkcija() {
        return ukupnaKilometraža() * 30;
    }
}
