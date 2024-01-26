package Zadatak1;

import java.util.ArrayList;
import java.util.Arrays;

public class Maratonac {
    private int godine;
    private ArrayList<Staza> listaStaza;

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public ArrayList<Staza> getListaStaza() {
        return listaStaza;
    }

    public void setListaStaza(ArrayList<Staza> listaStaza) {
        this.listaStaza = listaStaza;
    }

    public Maratonac(int godine, ArrayList<Staza> listaStaza) {
        this.godine = godine;
        this.listaStaza = listaStaza;
    }

    @Override
    public String toString() {
        return "Maratonac{" +
                "godine=" + godine +
                ", listaStaza=" + listaStaza +
                '}';
    }
    // najduzaStaza() - vraca najduzu stazu koju je maratonac istrcao

    public Staza najduza(){
        Staza najduzaStaza = null;
        int najduza = Integer.MIN_VALUE;
        for (Staza staza: listaStaza){
            if (staza.getDužina()>najduza){
                najduza = staza.getDužina();
                najduzaStaza = staza;
            }
        }
        return najduzaStaza;
    }

    // ukupnaKilometraza() - vraca ukupnu kilometrazu koju je presao sa svih staza

    public int ukupnaKilometraža(){
        int ukupnaKilometraža = 0;
        for (Staza staza: listaStaza){
            ukupnaKilometraža += staza.getDužina();
        }
        return ukupnaKilometraža;
    }

    // humanitarnaAkcija() - koliko je maratonac zaradio para za humanitarnu akciju ako je doprineo 20 po istrcanom km.

    public int humanitarnaAkcija(){
        int zarada = ukupnaKilometraža() * 20;
        return zarada;
    }

    //
}
