package Zadatak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class YouTube {
    private ArrayList<YouTubeKanal> listaKanala;

    public YouTube(ArrayList<YouTubeKanal> listaKanala) {
        this.listaKanala = listaKanala;
    }

    public ArrayList<YouTubeKanal> getListaKanala() {
        return listaKanala;
    }

    public void setListaKanala(ArrayList<YouTubeKanal> listaKanala) {
        this.listaKanala = listaKanala;
    }

    @Override
    public String toString() {
        return "YouTube{" +
                "listaKanala=" + listaKanala +
                '}';
    }

    // najprofitabilniji() - vraca YouTube kanal koji zaradjuje najvise para

    public YouTubeKanal najprofitabilniji() {
        double najvišePara = Double.MIN_VALUE;
        YouTubeKanal najprofitabilniji = null;
        for (YouTubeKanal kanal: listaKanala){
            if (kanal.zarada()>najvišePara){
                najvišePara = kanal.zarada();
                najprofitabilniji = kanal;
            }
        }
        return najprofitabilniji;
    }
    // izbaciKanal() - ukoliko neki gejming kanal ima manje od 100 pretplacenih korisnika na tom kanalu, izbaciti ga

    public void izbaciKanal() {
        for (int i=listaKanala.size()-1; i>=0; i--){
            if (listaKanala.get(i) instanceof GejmingKanal && listaKanala.get(i).getBrPretplatnika()<100){
                listaKanala.remove(i);
            }
        }
    }

    // search(String naziv) - za prosledjeni naziv vraca odredjeni video

    public Video search(String naziv) {
        Video traženi = null;
        for (YouTubeKanal kanal: listaKanala){
            for (Video vid: kanal.getListaVidea())
                if (vid.getNaziv().equalsIgnoreCase(naziv))
                    traženi = vid;
        }
        return traženi;
    }
    // (dodatni) - napraviti metodu koja sortira kanale po broju pretplatnika

    public void sortirajKanale(){
        Comparator<YouTubeKanal> chanel = Comparator.comparing(YouTubeKanal::getBrPretplatnika);
        Collections.sort(getListaKanala(), chanel);
    }

}
