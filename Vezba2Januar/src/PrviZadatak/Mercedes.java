package PrviZadatak;

public class Mercedes extends Automobil{
    public Mercedes(Točak rezervniTočak, double cena, int godinaProizvodnje, String boja) {
        super(rezervniTočak, cena, godinaProizvodnje, boja);
    }

    public void zamenaTočka (Točak stariTočak) {
        if(stariTočak.getBrojDanakorišćenja()>150){
            setRezervniTočak(new Točak(0, getRezervniTočak().getModel()));
            System.out.println("Ubačen je novi točak.");
        } else {
            System.out.println("Nema potrebe za zamenom točka");
        }
    }
}
