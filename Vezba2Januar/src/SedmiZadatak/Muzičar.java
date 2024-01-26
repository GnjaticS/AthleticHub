package SedmiZadatak;

import java.util.ArrayList;

public class Muzičar {
    private ArrayList<Album> listaAlbuma;

    public Muzičar(ArrayList<Album> listaAlbuma) {
        this.listaAlbuma = listaAlbuma;
    }

    public ArrayList<Album> getListaAlbuma() {
        return listaAlbuma;
    }

    public void setListaAlbuma(ArrayList<Album> listaAlbuma) {
        this.listaAlbuma = listaAlbuma;
    }

    @Override
    public String toString() {
        return "Muzičar{" +
                "listaAlbuma=" + listaAlbuma +
                '}';
    }
    // ukupnoPregleda() - koja vraca ukupan broj pregleda koje Muzicar ima sa svih pesama, sa svih albuma
    //- zarada() - vraca zaradu Muzicara
    public int ukupnoPregleda () {
        int count = 0;
        for (Album pivot: listaAlbuma){
            for (Pesma pi: pivot.getListaPesama()){
                count += pi.getBrojPregleda();
            }
        }
        return count;
    }

    public void zarada (){

    }
}
