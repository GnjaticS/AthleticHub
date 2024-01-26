package Zadatak;

import java.util.ArrayList;

public class YouTubeKanal {
    private int brPretplatnika;
    private ArrayList<Video> listaVidea;

    public YouTubeKanal(int brPretplatnika, ArrayList<Video> listaVidea) {
        this.brPretplatnika = brPretplatnika;
        this.listaVidea = listaVidea;
    }

    public int getBrPretplatnika() {
        return brPretplatnika;
    }

    public void setBrPretplatnika(int brPretplatnika) {
        this.brPretplatnika = brPretplatnika;
    }

    public ArrayList<Video> getListaVidea() {
        return listaVidea;
    }

    public void setListaVidea(ArrayList<Video> listaVidea) {
        this.listaVidea = listaVidea;
    }

    @Override
    public String toString() {
        return "YouTubeKanal{" +
                "brPretplatnika=" + brPretplatnika +
                ", listaVidea=" + listaVidea +
                '}';
    }

    // najpopuarnijiVideo() - vraca video sa najvise pregleda

    public Video najpopularnijiVideo() {
        int najviše = Integer.MIN_VALUE;
        Video najvišePregleda = null;
        for (Video vid: listaVidea){
            if (vid.getBrPregleda()> najviše){
                najviše = vid.getBrPregleda();
                najvišePregleda = vid;
            }
        }
        return najvišePregleda;
    }

    // ukupnoSvidjanja() - vraca ukupan broj lajkova sa svih Videa

    public int ukupnoSviđanja() {
        int ukupnoLajkova = 0;
        for (Video vid: listaVidea) {
            ukupnoLajkova += vid.getBrLajkova();
        }
        return ukupnoLajkova;
    }

    // zarada() - vraca ukupnu zaradu kanala ako racunamo da zaradjuje 10 po lajku.

    public double zarada() {
        int zarada = ukupnoSviđanja()*10;
        return zarada;
    }


}
