package PrviZadatak;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Namirnica> listaNamirnica;

    // ukupnaZaradaKorpe() - vraca cenu svih namirnica u korpi

    public double ukupnaZaradaKorpe (){
        double rez = 0;
        for (Namirnica nam: listaNamirnica){
            rez += nam.getCena();
        }
        return rez;
    }

    // popust() - ostvaruje 10% popust na sve namirnice u korpi

    public void popust(){
        double cenaPopust = ukupnaZaradaKorpe()
    }
}


