package Zadatak1;

import java.util.ArrayList;

public class Agencija {
    private ArrayList<StambeniObjekat> objekti;

    public Agencija(ArrayList<StambeniObjekat> objekti) {
        this.objekti = objekti;
    }

    public ArrayList<StambeniObjekat> getObjekti() {
        return objekti;
    }

    public void setObjekti(ArrayList<StambeniObjekat> objekti) {
        this.objekti = objekti;
    }

    @Override
    public String toString() {
        return "Agencija{" +
                "objekti=" + objekti +
                '}';
    }

    // najboljaPonuda() -> vraca stambeni objekat sa najmanjom cenom po kvadratu
    public StambeniObjekat najboljaPonuda() {
        StambeniObjekat najbolji = null;
        double najmanjaCena = Integer.MAX_VALUE;
        for (StambeniObjekat pivot : objekti) {
            if (pivot.cenaPoKvadratu() < najmanjaCena) {
                najmanjaCena = pivot.cenaPoKvadratu();
                najbolji = pivot;
            }
        }
        return najbolji;
    }
    // najjeftiniji() -> vraca najjeftiniji stambeni objekat

    public double najjeftinijiStan() {
        double najjeftiniji = Integer.MAX_VALUE;
        for (StambeniObjekat pivot : objekti) {
            if (pivot.getCena() < najjeftiniji) {
                najjeftiniji = pivot.getCena();
            }
        }
        return najjeftiniji;
    }
    // uPonudi(String location) -> za prosledjenu lokaciju nam vraca listu stambenih objekata na  toj lokaciji

    public Agencija uPonudi(String location) {
        Agencija nešto = null;
        ArrayList<StambeniObjekat> novaLista = new ArrayList<>();
        for (StambeniObjekat pivot : objekti) {
            if (pivot.getLokacija().equalsIgnoreCase(location)) {
                novaLista.add(pivot);
            }
        }
        nešto = new Agencija(novaLista);
        return nešto;
    }
    // uBudzetu(double budzet) -> za prosledjeni budzet nam vraca listu stambenih objekata koje korisnik moze da prisusti

    public ArrayList<StambeniObjekat> uBudžetu(double budžet) {
        ArrayList<StambeniObjekat> listaAffordable = new ArrayList<>();
        for (StambeniObjekat pivot : objekti) {
            if (pivot.getCena() <= budžet) {
                listaAffordable.add(pivot);
            }
        }
        return listaAffordable;
    }

    // izbaciBezTerase() -> izbacuje iz liste sve stanove koji nemaju terasu

    /* public ArrayList<StambeniObjekat> izbaciBezTerase() {
        ArrayList<StambeniObjekat> listeBezBalkona = new ArrayList<>();

        for (StambeniObjekat pivot: objekti) {
            if (pivot instanceof Stan) {
                if (((Stan) pivot).isTerasa()) {
                    listeBezBalkona.add(pivot);
                }
            } else {
                listeBezBalkona.add(pivot);
            }
        }
        setObjekti(listeBezBalkona);
        return objekti;
    }

     */
    public double ukupnaCena () {
        double suma = 0;
        for (StambeniObjekat pivot: objekti){
            suma += pivot.getCena();
        }
        return suma;
    }
    public ArrayList<StambeniObjekat> izbaciBezTerase() {
        for (int i=objekti.size()-1; i>=0; i--){
            StambeniObjekat name = objekti.get(i);
            if (name instanceof Stan && !((Stan) name).isTerasa())
                objekti.remove(name);
        }
        return objekti;
    }

}
