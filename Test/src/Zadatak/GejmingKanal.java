package Zadatak;

import java.util.ArrayList;

public class GejmingKanal extends YouTubeKanal{
    public GejmingKanal(int brPretplatnika, ArrayList<Video> listaVidea) {
        super(brPretplatnika, listaVidea);
    }
    // zaradjuje 100 od videa koji imaju vise od 1000 pregleda.


    @Override
    public double zarada() {
        double zarada2 = 0;
        for (Video vid: getListaVidea()){
            if (vid.getBrPregleda()>1000){
                zarada2 += 100;
            }
        }
        return zarada2;
    }
}
