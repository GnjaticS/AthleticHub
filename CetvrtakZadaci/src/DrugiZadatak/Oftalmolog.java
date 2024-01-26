package DrugiZadatak;

import java.util.ArrayList;

public class Oftalmolog extends Doktor{
    public Oftalmolog(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
    }

    public int zarada2 () {
        int ukupnaZarada = getListaPacijenata().size() * 140;
        return ukupnaZarada;
    }
}
