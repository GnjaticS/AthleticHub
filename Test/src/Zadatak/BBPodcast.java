package Zadatak;

import java.util.ArrayList;

public class BBPodcast extends YouTubeKanal{
    public BBPodcast(int brPretplatnika, ArrayList<Video> listaVidea) {
        super(brPretplatnika, listaVidea);
    }

    @Override
    public double zarada() {
        return ukupnoSviđanja()*10*1.15;
    }
}
