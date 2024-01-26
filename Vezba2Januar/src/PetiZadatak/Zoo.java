package PetiZadatak;

import java.util.ArrayList;

public class Zoo{

    private ArrayList<Životinja> listaŽivotinja;
    public Zoo(ArrayList listaŽivotinja) {
        this.listaŽivotinja = listaŽivotinja;
    }
    // Napraviti klasu Zoo koji ima listu zivotinja i metodu koja broji koliko imamo pasa a koliko macaka.
    public void brojŽivotinja () {
        int countDog = 0;
        int countCat = 0;
        for (Životinja pivot: listaŽivotinja){
            if (pivot instanceof Pas){
                countDog++;
            } else if (pivot instanceof Mačka) {
                countCat++;
            }
        }

        System.out.println("U zoološkom vrtu imamo: " + countCat + " mačke, a " + countDog + " psa");
    }

}
