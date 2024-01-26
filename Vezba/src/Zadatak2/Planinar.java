package Zadatak2;

import java.util.ArrayList;

public abstract class Planinar {
    private String imePlaninara;
    private ArrayList<Planina> listaPlanina;

    public Planinar(String imePlaninara, ArrayList<Planina> listaPlanina) {
        this.imePlaninara = imePlaninara;
        this.listaPlanina = listaPlanina;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public abstract void izbaciPlaninu();

    public int ukupnavisina () {
        int ukupno = 0;
        for (Planina pivot: listaPlanina) {
            ukupno += pivot.getVisina();
        }
        return ukupno;
    }

}
