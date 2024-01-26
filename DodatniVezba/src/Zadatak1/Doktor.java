package Zadatak1;

import java.util.ArrayList;

public class Doktor {
    private int id;
    private ArrayList<Pacijent> listaPacijenata;
    protected int pay = 100;
    protected int brojPacijenta = 30;

    public Doktor(int id, ArrayList<Pacijent> listaPacijenata) {
        this.id = id;
        this.listaPacijenata = listaPacijenata;
    }
    // brojDijagnoza(String dijagnoza) - koja vraca broj pojavljivanja jedna dijagnoze

    public int brojPonavljanja (String dijagnoza) {
        int count = 0;
        for (Pacijent pivot: listaPacijenata){
            if (pivot.getDijagnoza().equalsIgnoreCase(dijagnoza)){
                count++;
            }
        }
        return count;
    }
    // zarada() - vraca ukupnu zaradu doktora (zaradjuje 100e po pacijentu)

    public int ukupnaZarada (){
        return listaPacijenata.size()*pay;
    }

    // dodajPacijenta(Pacijent p) - dodaje pacijenta u listu pacijenata (doktor moze da ima do 30 pacijenata, tako da obratite
    //paznju da ga ne ubacujemo preko limita)

    public boolean addPacijent (Pacijent p) {
        if (listaPacijenata.size()<brojPacijenta){
            listaPacijenata.add(p);
            return true;
        }
        return false;
    }
}
