package Zadatak1;

import java.util.ArrayList;

public class Maraton {
    private ArrayList<Maratonac> listaMaratonaca;
    private double temperatura;

    @Override
    public String toString() {
        return "Maraton{" +
                "listaMaratonaca=" + listaMaratonaca +
                ", temperatura=" + temperatura +
                '}';
    }

    public ArrayList<Maratonac> getListaMaratonaca() {
        return listaMaratonaca;
    }

    public void setListaMaratonaca(ArrayList<Maratonac> listaMaratonaca) {
        this.listaMaratonaca = listaMaratonaca;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Maraton(ArrayList<Maratonac> listaMaratonaca, double temperatura) {
        this.listaMaratonaca = listaMaratonaca;
        this.temperatura = temperatura;
    }

    // izbaci() - ukoliko je temperatura veca od 35 stepeni izbaciti sve amatere.

    public void izbaci(){
        for (int i=listaMaratonaca.size()-1; i>=0; i--){
            if (temperatura>35 && listaMaratonaca.get(i) instanceof Amater){
                listaMaratonaca.remove(i);
            }
        }
    }

    // ubaci(Maratonac m) - ukoliko maratonac ima bar 18 godina i bar 3 istrcane staze, ubaciti ga

    /* public void ubaci(Maratonac m) {
        for (Maratonac maratonac: listaMaratonaca){
            if (maratonac.getGodine()>=18 && maratonac.getListaStaza().size()>=3){
                listaMaratonaca.add(m);
            }
        }
    }

     */

    public void ubaci(Maratonac m){
        if (m.getGodine()>=18 && m.getListaStaza().size()>3){
            listaMaratonaca.add(m);
        }
    }

    // nadjiStazu(Staza s) - vraca true ukoliko se data staza nalazi u maratoncevoj listi

    public boolean nađiStazu(Staza s){
        for (Maratonac maratonac: listaMaratonaca){
            for (Staza staza: maratonac.getListaStaza()){
                if (staza == s){
                    return true;
                }
            }
        }
        return false;
    }
}
