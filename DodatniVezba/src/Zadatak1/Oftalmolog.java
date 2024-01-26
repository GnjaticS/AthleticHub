package Zadatak1;

import java.util.ArrayList;

public class Oftalmolog extends Doktor{
    public Oftalmolog(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
        this.pay = 120;
    }
}
