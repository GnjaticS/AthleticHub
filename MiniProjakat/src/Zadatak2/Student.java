package Zadatak2;

import java.util.ArrayList;

public class Student {
    private String id;
    private int godinaStudiranja;
    private ArrayList<Integer> listaOcena;

    public Student(String id, int godinaStudiranja, ArrayList<Integer> listaOcena) {
        this.id = id;
        this.godinaStudiranja = godinaStudiranja;
        this.listaOcena = listaOcena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", godinaStudiranja=" + godinaStudiranja +
                ", listaOcena=" + listaOcena +
                '}';
    }
    public double prosek () {
        double suma = 0;
        double prosekOcena = 0;
        for (int i=0; i<listaOcena.size(); i++){
            suma += listaOcena.get(i);
        }
        prosekOcena = suma / listaOcena.size();
        return prosekOcena;
    }
}
