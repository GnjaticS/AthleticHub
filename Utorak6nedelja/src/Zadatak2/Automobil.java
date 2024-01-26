package Zadatak2;

public class Automobil {
    private boolean rezervniTocak;
    private double cena;
    private int godinaProizvodnje;
    private String boja;

    public Automobil(boolean rezervniTocak, double cena, int godinaProizvodnje, String boja ) {
        this.boja = boja;
        this.godinaProizvodnje = godinaProizvodnje;
        this.cena = cena;
        this.rezervniTocak = rezervniTocak;
    }

    public boolean getRezervniTocak() {
        return rezervniTocak;
    }

    public void setRezervniTocak(boolean rezervniTocak) {
        this.rezervniTocak = rezervniTocak;
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

    public String toString () {
        return boja + " " + cena + " " + godinaProizvodnje + " " + rezervniTocak;
    }
    public double popust () {
        cena = cena * 0.3;
        return cena;
    }
    public
}
