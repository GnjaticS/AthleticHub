package DrugiZadatak;

import java.util.ArrayList;

public abstract class Planinar {
    private String imePlaninara;
    private ArrayList<Planina> listaPlanina;

    public abstract ArrayList<Planina> izbacivanjePlanine();

    public int ukupnaVisina (){
        int ukupnavisina = 0;
        for (Planina pivot: listaPlanina){
            ukupnavisina += pivot.getVisina();
        }


    }
}
