package Zadatak2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fakultet {
    ArrayList<Departman> listaDepartmana;

    public Fakultet(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    @Override
    public String toString() {
        return "Fakultet{" +
                "listaDepartmana=" + listaDepartmana +
                '}';
    }

    // djaciGeneracije() - vraca listu najboljih ucenika sa svakog departmana

    public ArrayList<Student> đaciGeneracije () {
        ArrayList<Student> đaciGeneracije = new ArrayList<>();
        for (Departman pivot: listaDepartmana){
            đaciGeneracije.add(pivot.najuspešniji());
        }
        return đaciGeneracije;
    }
    // upisiUcenika(Ucenik u, Departman d) - upisuje Ucenika u na Departman d

    public void upisiUčenika (Student s, Departman d){

        d.getListaStudenata().add(s);
    }
    // najviseDobrih() - vraca Departman koji ima najvise studenata sa prosekom iznad 9.5

    /* public Departman najvišeDobrih () {
        ArrayList<Integer> dptCnt = new ArrayList<>();
        dptCnt.add(4);
        dptCnt.add(8);

        int max = Integer.MIN_VALUE;
        int max_i = -1;
        for (int i=0; i<dptCnt.size(); i++){
            if (dptCnt.get(i) > max){
                max = dptCnt.get(i);
                max_i = i;
            }
        }
        return listaDepartmana.get(max_i);
    }

     */
    public Departman najvišeDobrih () {
        Departman najvišeDobrih = null;
        int count = Integer.MIN_VALUE;
        for (Departman pivot: listaDepartmana){
            int count_current_dep = 0;
            for (Student student: pivot.getListaStudenata()) {
                if(student.prosek()>9.5){
                    count_current_dep++;
                }
            }
            if (count_current_dep>count) {
                count = count_current_dep;
                najvišeDobrih = pivot;
            }
        }
        return najvišeDobrih;

    }
}
