package Liste;

import java.util.ArrayList;

public class Student {
    //Napraviti klasu Student koja ima ime i listu ocena.Poseduje metode prosek()
    // koji vraca prosek ucenikovih ocena i najvecaOcena() koji vraca najvecu zabelezenu ucenikovu ocenu.
    private String ime;
    private ArrayList <Integer> listaOcena = new ArrayList<>();

    public Student (String a, ArrayList <Integer> b) {
        this.ime = a;
        this.listaOcena = b;
    }

    public String getIme (){
        return ime;
    }
    public void setIme (String novoIme){
        this.ime = novoIme;
    }

    public ArrayList <Integer> getLista () {
        return getLista();
    }
    public void setLista (ArrayList <Integer> novaLista) {
        this.listaOcena = novaLista;
    }
    public double prosek (ArrayList <Integer> a) {
        double prosek = 0;
        double count = 0;
        for (int i=0; i<a.size(); i++) {
            count += a.get(i);
        }
        prosek = count / a.size();
        return prosek;
    }
    public String toString () {
        return "Prosek ocena učenika je: " + prosek()
    }
}
