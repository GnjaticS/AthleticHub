package Zadatak2;

import java.util.ArrayList;

public class Departman {
    private ArrayList<Student> listaStudenata;
    protected double granica = 7.0;

    public Departman(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }
    // najuspesnijiUcenik() - vraca ucenika sa najboljim prosekom

    public Student najuspešniji () {
        Student najuspešnijiStudent = null;
        double najvećiProsek = Double.MIN_VALUE;
        for (Student pivot: listaStudenata){
            if(pivot.prosek()>najvećiProsek){
                najvećiProsek = pivot.prosek();
                najuspešnijiStudent = pivot;
            }
        }
        return najuspešnijiStudent;
    }
    // vratiUcenike(int godina) - vraca listu ucenika iz odredjene godine studiranje (npr sve ucenike koji su na
    //drugoj godini studiranja)

    public ArrayList<Student> vratiStudenta (int godina) {
        ArrayList<Student> poGodini = new ArrayList<>();
        for (Student pivot: listaStudenata){
            if(pivot.getGodinaStudiranja() == godina){
                poGodini.add(pivot);
            }
        }
        return poGodini;
    }
    // izbacivanje() - izbacuje iz liste sve studente koji imaju prosek ispod 7.0

    public void removeStudent (){
        for (Student pivot: listaStudenata){
            if (pivot.prosek()<granica) {
                listaStudenata.remove(pivot);
            }
        }
    }

    @Override
    public String toString() {
        return "Departman{" +
                "listaStudenata=" + listaStudenata +
                '}';
    }
    public void addingStudent (Student s){
        listaStudenata.add(s);
    }


}
