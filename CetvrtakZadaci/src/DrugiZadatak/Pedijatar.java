package DrugiZadatak;

import java.util.ArrayList;

public class Pedijatar extends Doktor{
    public Pedijatar(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
    }

    // Klasa Pedijatar nasledjuje klasu Doktor i on moze da ima dodaje do 40 pacijenata ali samo oni koji nemaju vise od 18 godina.
    public void dodajPacijenta (Pacijent p) {{
            if(getListaPacijenata().size()<40 && p.getBrojGodina()<=18){
                getListaPacijenata().add(p);
        }



        }
    }
}
