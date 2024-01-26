package Vezba2812;

import java.util.ArrayList;

public abstract class Fakultet {
    private ArrayList<Ucenik> listaUcenka;

    public Fakultet(ArrayList<Ucenik> listaUcenka) {
        this.listaUcenka = listaUcenka;
    }

    public ArrayList<Ucenik> getListaUcenka() {
        return listaUcenka;
    }

    public void setListaUcenka(ArrayList<Ucenik> listaUcenka) {
        this.listaUcenka = listaUcenka;
    }

    @Override
    public String toString() {
        return "Fakultet{" +
                "listaUcenka=" + listaUcenka +
                '}';
    }
    public int uspesniUcenik(){
        int brojac = 0;
        for (int i=0; i<listaUcenka.size(); i++){
            if(listaUcenka.get(i).prosek() > 8.5){
                brojac ++;
            }
        }
        return brojac;
    }
    public abstract void zarada ();
}
