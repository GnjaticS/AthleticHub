package ZadatakInterfejs;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteka implements Usluge{

    private Knjiga [] nizKnjiga;

    public Biblioteka(Knjiga[] nizKnjiga) {
        this.nizKnjiga = nizKnjiga;
    }

    public Knjiga[] getNizKnjiga() {
        return nizKnjiga;
    }

    public void setNizKnjiga(Knjiga[] nizKnjiga) {
        this.nizKnjiga = nizKnjiga;
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "nizKnjiga=" + Arrays.toString(nizKnjiga) +
                '}';
    }

    public Biblioteka() {

    }

    // knjigaSaNajviseStrana() - vraca knjigu koja ima najvise strana

    public Knjiga knjigaSaNajvišeStrana(){
        int najvišeStrana = Integer.MIN_VALUE;
        Knjiga knjigaSaNajvišeStr = null;
        for (Knjiga knjiga: nizKnjiga){
            if (knjiga.getBrStrana()>najvišeStrana){
                najvišeStrana = knjiga.getBrStrana();
                knjigaSaNajvišeStr = knjiga;
            }
        }
        return knjigaSaNajvišeStr;
    }

    // popustNaZanr(String zanrPopust) - daje popust od 35% na sve knjige odredjenog zanra

    public void popustNaŽanr(String žanrPopust){
        for (Knjiga knjiga: nizKnjiga){
            if (knjiga.getŽanr().equalsIgnoreCase(žanrPopust)){
                knjiga.setCena(knjiga.getCena()*0.65);
            }
        }
    }

}
