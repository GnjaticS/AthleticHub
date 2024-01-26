package PrviZadatak;

public class BMW extends Automobil{
    public BMW(Točak rezervniTočak, double cena, int godinaProizvodnje, String boja) {
        super(rezervniTočak, cena, godinaProizvodnje, boja);
    }
    public void popustBMW (){
        // BMW daje popust od 50% na sve modele koji su beli
        if (getBoja().equalsIgnoreCase("bela")) {
            setCena(getCena()*0.5);
        }
        System.out.println("Cena automobila sa popustom je: " + getCena());
    }
}
