package Zadatak1;

import java.util.ArrayList;

public class Pedijatar extends Doktor{
    public Pedijatar(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
        this.brojPacijenta = 40;
    }



    @Override
    public boolean addPacijent(Pacijent p) {
        if (p.getBrojGodina()<18){
            return super.addPacijent(p);
        }
        return false;
    }

}
