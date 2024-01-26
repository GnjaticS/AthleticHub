package Zadatak2;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Namirnica> listaNamirnica;

    @Override
    public String toString() {
        return "Korpa{" +
                "listaNamirnica=" + listaNamirnica +
                '}';
    }

    public ArrayList<Namirnica> getListaNamirnica() {
        return listaNamirnica;
    }

    public void setListaNamirnica(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public Korpa(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    // ukupnaZaradaKorpe() - vraca cenu svih namirnica u korpi

    public double ukupnaZaradaKorpe(){
        double zarada = 0;
        for (Namirnica nam: listaNamirnica){
            zarada += nam.getCena();
        }
        return zarada;
    }

    // popust() - ostvaruje 10% popust na sve namirnice u korpi

    public void popust(){
        for (Namirnica nam: listaNamirnica){
            nam.setCena(nam.getCena()*0.9);
        }
    }

    // daLiSeNalazi(Namirnica n) - vraca true ako se data namirnica nalazi u listi

    public boolean daLiSeNalazi(Namirnica n){
        for (Namirnica nam: listaNamirnica){
            if (nam == n){
                return true;
            }
        }
        return false;
    }

}
