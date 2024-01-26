package DrugiZadatak;

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

    public Pedijatar najuspesnijiPedijatar (Pedijatar pedijatar){
        int najvecibroj = Integer.MIN_VALUE;

        for(int i=0; i<pedijatar.getListaPacijenata().size(); i++){
            if(pedijatar.getListaPacijenata().size()>najvecibroj){
                najvecibroj = listaLekara.get(i).getListaPacijenata().size();
                Pedijatar najuspesniji = new Pedijatar(pedijatar)
            }
        }
        return ;
    }

}
