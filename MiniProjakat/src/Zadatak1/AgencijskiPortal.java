package Zadatak1;

import java.util.ArrayList;

public class AgencijskiPortal {
    ArrayList<Agencija> listaAgencija;

    public AgencijskiPortal(ArrayList<Agencija> listaAgencija) {
        this.listaAgencija = listaAgencija;
    }

    @Override
    public String toString() {
        return "AgencijskiPortal{" +
                "listaAgencija=" + listaAgencija +
                '}';
    }

    public ArrayList<Agencija> getListaAgencija() {
        return listaAgencija;
    }

    public void setListaAgencija(ArrayList<Agencija> listaAgencija) {
        this.listaAgencija = listaAgencija;
    }

    // najvrednije() -> vraca agenciju koja ima najvecu vrednost u stambenim objektima

    public Agencija najvrednije () {
        Agencija najbolja = null;
        double suma = Integer.MIN_VALUE;
        for (Agencija pivot: listaAgencija){
            if (pivot.ukupnaCena()> suma);
            suma = pivot.ukupnaCena();
            najbolja = new Agencija(pivot.getObjekti());
        }
        return najbolja;
    }

    // ubaci(Agencija a) -> ubacuje agenciju u listu ukoliko ima vise od 3 stambena objekta u ponudi

    public void ubaciAgenciju (Agencija a) {
        if (a.getObjekti().size()>3){
            listaAgencija.add(a);
            System.out.println(listaAgencija);
        }
        else {
            System.out.println("Agencija nema dovoljno objekata. ");
        }

    }
}
