package PrviZadatak;

import java.util.ArrayList;

public abstract class Fakultet {
    private ArrayList<Ucenik> listaUcenika;

    public Fakultet(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }

    public int brojUspesnih (ArrayList<Ucenik> listaUcenika) {
        int brojac = 0;
        for (int i=0; i<listaUcenika.size(); i++) {
            if (listaUcenika.get(i).prosek() >= 8.5) {
                brojac ++;
            }
        }
        return brojac;
    }
    public abstract int zarada ();

    public ArrayList<Ucenik> getListaUcenika() {
        return listaUcenika;
    }

    public void setListaUcenika(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }
}
