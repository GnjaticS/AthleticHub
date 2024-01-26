package PrviZadatak;

public class Automobil {
    private Točak rezervniTočak;
    private double cena;
    private int godinaProizvodnje;
    private String boja;

    public Automobil(Točak rezervniTočak, double cena, int godinaProizvodnje, String boja) {
        this.rezervniTočak = rezervniTočak;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
        this.boja = boja;
    }

    public Točak getRezervniTočak() {
        return rezervniTočak;
    }

    public void setRezervniTočak(Točak rezervniTočak) {
        this.rezervniTočak = rezervniTočak;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "rezervniTočak=" + rezervniTočak +
                ", cena=" + cena +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", boja='" + boja + '\'' +
                '}';
    }

    public double popust (){
        return cena * 0.3;
    }
    //novTocak() - kreira i ubacuje nam nov Tocak ukoliko je nas Tocak koriscen vise od 100 dana

    public void noviTočak (Točak stariTočak) {
        if (stariTočak.getBrojDanakorišćenja()>100) {
            rezervniTočak = new Točak(0, rezervniTočak.getModel());
            System.out.println("Ubačen je novi točak");
        }
        else {
            System.out.println("Nema potrebe za ubacivanjem novog točka");
        }
    }
}
