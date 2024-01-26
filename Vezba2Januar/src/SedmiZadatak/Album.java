package SedmiZadatak;

import java.util.ArrayList;

public class Album {
    private String nazivAlbuma;
    private ArrayList<Pesma> listaPesama;

    public Album(String naziv, ArrayList<Pesma> listaPesama) {
        this.nazivAlbuma = naziv;
        this.listaPesama = listaPesama;
    }

    public String getNaziv() {
        return nazivAlbuma;
    }

    public void setNaziv(String naziv) {
        this.nazivAlbuma = naziv;
    }

    public ArrayList<Pesma> getListaPesama() {
        return listaPesama;
    }

    public void setListaPesama(ArrayList<Pesma> listaPesama) {
        this.listaPesama = listaPesama;
    }

    @Override
    public String toString() {
        return "Album{" +
                "naziv='" + nazivAlbuma + '\'' +
                ", listaPesama=" + listaPesama +
                '}';
    }
    // najveciHit() - koji vraca naziv pesme sa albuma koja ima najvise pregleda
    public String najvećiHit () {
        int najvećiBroj = Integer.MIN_VALUE;
        Pesma hit = new Pesma(0, "");
        for (Pesma pivot : listaPesama){
            if (pivot.getBrojPregleda()>najvećiBroj){
                najvećiBroj = pivot.getBrojPregleda();
                hit = new Pesma(pivot.getBrojPregleda(), pivot.getNaziv());

            }
        }
       return hit.getNaziv();
    }
}
