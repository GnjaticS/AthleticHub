package Zadatak2;

import java.util.ArrayList;

public class Profesionalac extends Planinar{
    public Profesionalac(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
    }

    @Override
    public void izbaciPlaninu() {
        for (int i=getListaPlanina().size()-1; i>=0; i--) {
            if(getListaPlanina().get(i).getVisina()>3500){
                getListaPlanina().remove(i);
            }
        }
    }
}
