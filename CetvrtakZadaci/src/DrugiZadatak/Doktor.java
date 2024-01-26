package DrugiZadatak;

import java.util.ArrayList;

public class Doktor {

    private int id;
    private ArrayList<Pacijent> listaPacijenata;

    public Doktor(int id, ArrayList<Pacijent> listaPacijenata) {
        this.id = id;
        this.listaPacijenata = listaPacijenata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pacijent> getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata(ArrayList<Pacijent> listaPacijenata) {
        this.listaPacijenata = listaPacijenata;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "id=" + id +
                ", listaPacijenata=" + listaPacijenata +
                '}';
    }

    // brojDijagnoza(String dijagnoza) - koja vraca broj pojavljivanja jedna dijagnoze

    public int brojDijagnoza (String dijagnoza){
        int brojac = 0;
        for (int i=0; i<listaPacijenata.size(); i++){
            if(listaPacijenata.get(i).getDijagnoza().equalsIgnoreCase(dijagnoza)){
                brojac ++;
            }

        }
        return brojac;
    }
    // zarada() - vraca ukupnu zaradu doktora (zaradjuje 100e po pacijentu)

    public int zarada (){
        int ukupnaZarada = getListaPacijenata().size()*100;
        return ukupnaZarada;
    }

    // dodajPacijenta(Pacijent p) - dodaje pacijenta u listu pacijenata (doktor moze da ima do 30 pacijenata,
    //tako da obratite paznju da ga ne ubacujemo preko limita)

    public void dodajPacijenta(Pacijent p){
        if(listaPacijenata.size()<30){
            listaPacijenata.add(p);
        }

    }

}
