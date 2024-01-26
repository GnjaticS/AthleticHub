package PetiZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pas pas = new Pas(12, true);
        pas.zvukŽivotinje();
        Mačka mačka = new Mačka(5, true);
        mačka.zvukŽivotinje();

        ArrayList<Životinja> životinje = new ArrayList<>();
        životinje.add(pas);
        životinje.add(pas);
        životinje.add(pas);
        životinje.add(mačka);
        životinje.add(mačka);


        Zoo vrt = new Zoo(životinje);
        vrt.brojŽivotinja();

    }
}
