package PrviZadatak;

import java.util.ArrayList;

public class Film {
    // naziv, godinu izdanja i listu Glumaca
    private String naziv;
    private int godinaIzdanja;
    private ArrayList<Glumac> listaGlumaca;

    public Film(String naziv, int godinaIzdanja, ArrayList<Glumac> listaGlumaca) {
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.listaGlumaca = listaGlumaca;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public ArrayList<Glumac> getListaGlumaca() {
        return listaGlumaca;
    }

    public void setListaGlumaca(ArrayList<Glumac> listaGlumaca) {
        this.listaGlumaca = listaGlumaca;
    }

    @Override
    public String toString() {
        return "Film{" +
                "naziv='" + naziv + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                ", listaGlumaca=" + listaGlumaca +
                '}';
    }

    // najmladjiGlumac() - koja vraća ime i prezime najmlađeg glumca na filmu.

    public String najmlađiIme () {
        int najmlađi = Integer.MAX_VALUE;
        String ime = "";
        for (Glumac pivot: listaGlumaca){
            if (pivot.getGodineIskustva()<najmlađi){
                najmlađi = pivot.getGodineIskustva();
                ime = pivot.getIme();
            }
        }
        return ime;
    }

    public Glumac najmlađi () {
        int najmanjeStaža = Integer.MAX_VALUE;
        Glumac najmlađi = null;
        for (Glumac pivot: listaGlumaca){
            if (pivot.getGodineIskustva()<najmanjeStaža){
                najmanjeStaža = pivot.getGodineIskustva();
                najmlađi = pivot;
            }
        }
        return najmlađi;

        }
}
