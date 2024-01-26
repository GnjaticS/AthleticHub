package Zadatak2;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Prodavnica {
    private ArrayList<Kupac> listaKupaca;

    @Override
    public String toString() {
        return "Prodavnica{" +
                "listaKupaca=" + listaKupaca +
                '}';
    }

    public ArrayList<Kupac> getListaKupaca() {
        return listaKupaca;
    }

    public void setListaKupaca(ArrayList<Kupac> listaKupaca) {
        this.listaKupaca = listaKupaca;
    }

    public Prodavnica(ArrayList<Kupac> listaKupaca) {
        this.listaKupaca = listaKupaca;
    }

    // zlatniKupac() - vraca kupca koji je potrosio najvise para u prodavnici

    public Kupac zlatniKupac(){
        Kupac kupac1 = null;
        double ukupno = Double.MIN_VALUE;
        for (Kupac kupac: listaKupaca){
            if (kupac.getKorpa().ukupnaZaradaKorpe()>ukupno){
                ukupno = kupac.getKorpa().ukupnaZaradaKorpe();
                kupac1 = kupac;
            }
        }
        return kupac1;
    }

    // nagradniPobednik() - vraca nasumicnog kupca iz liste koji je osvojio putovanje

    public Kupac nagradniPobednik() {
        Random izvlačenje = new Random();
        int izvučen = izvlačenje.nextInt(listaKupaca.size());
        return listaKupaca.get(izvučen);
    }

    /*
     public Kupac nagradniPobednik() {
        Random izvlacenje = new Random();
        int izvucen = izvlacenje.nextInt(kupci.size()); // daje nam random broj od 0 do poslednjeg index-a u listi korisnika
        return kupci.get(izvucen);
     */

}
