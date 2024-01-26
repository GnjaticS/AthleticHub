package Zadatak1;

import java.util.ArrayList;

public class Bolnica {
    private ArrayList<Doktor> listaLekara;

    public Bolnica(ArrayList<Doktor> listaLekara) {
        this.listaLekara = listaLekara;
    }

    public ArrayList<Doktor> getListaLekara() {
        return listaLekara;
    }

    public void setListaLekara(ArrayList<Doktor> listaLekara) {
        this.listaLekara = listaLekara;
    }

    @Override
    public String toString() {
        return "Bolnica{" +
                "listaLekara=" + listaLekara +
                '}';
    }

    // najuspesnijiPedijatar() - vraca Pedijatra sa najvise pacijenata

    public Pedijatar najuspesniji (){
        Pedijatar count = null;
        for (Doktor pivot: listaLekara){
            if(pivot instanceof Pedijatar){
                if (count == null || pivot.ukupnaZarada()>count.ukupnaZarada()){
                    count = (Pedijatar) pivot;
                }
            }
        }
        return count;
    }
}
