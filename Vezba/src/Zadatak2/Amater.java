package Zadatak2;

import java.util.ArrayList;

public class Amater extends Planinar{
    public Amater(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
    }

    @Override
    public void izbaciPlaninu() {
        for (int i=getListaPlanina().size() -1; i>=0; i--){
            if (getListaPlanina().get(i).getVisina()>1500){
                getListaPlanina().remove(i);
            }
        }
    }
}
