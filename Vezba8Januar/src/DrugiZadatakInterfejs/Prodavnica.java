package DrugiZadatakInterfejs;

import java.util.ArrayList;
import java.util.Arrays;

public class Prodavnica {
    private ArrayList<Artikl> listaArtikala;

    public Prodavnica(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public void setListaArtikala(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "listaArtikala=" + listaArtikala +
                '}';
    }

    // sortiraj() - sortiraj listu artikala po ceni

    public void sortiraj(){
        for (int i=0; i<listaArtikala.size() - 1; i++){
            int minIndex = i;
            for (int j=i+1; j<listaArtikala.size(); j++){
                if (listaArtikala[minIndex].)
            }
        }
    }
    // public void sortiraj() {
//        for(int i=0; i<niz.length-1; i++) {
//            int minIndex = i;
//            for(int j=i+1; j<niz.length; j++) {
//                if(niz[minIndex].getCena() > niz[j].getCena()) {
//                    minIndex = j;
//                }
//            }
//            Knjiga temp = niz[minIndex];
//            niz[minIndex] = niz[i];
//            niz[i] = temp;
//        }
//    }

    // popust() - daje popust 20% na najskuplji artikl u radnji

    public void popust() {
        for (Artikl artikl: listaArtikala){
            artikl.setCena(artikl.getCena()*0.8);
        }
    }
}
