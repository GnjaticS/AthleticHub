package ČetvrtiZadatak;

public class Knjiga {
    private String naslov;
    private String autor;
    private int godinaIzdanja;

    public Knjiga(String naslov, String autor, int godinaIzdanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                '}';
    }
    // prikaziInformacije(), koja ispisuje osnovne informacije o knjizi.
    public void info () {
        System.out.println(toString());
    }
}
