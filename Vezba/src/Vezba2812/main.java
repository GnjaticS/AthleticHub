package Vezba2812;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(10);
        ocene.add(10);
        ocene.add(9);

        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(9);
        ocene2.add(9);
        ocene2.add(9);

        ArrayList<Integer> ocene3 = new ArrayList<>();
        ocene3.add(4);
        ocene3.add(9);
        ocene3.add(4);

        Ucenik ucenik1 = new Ucenik(1324, 23, ocene);
        System.out.println("Prosek ocena za prvog ucenika je: " + ucenik1.prosek());

        Ucenik ucenik2 = new Ucenik(1423, 22, ocene2);
        Ucenik ucenik3 = new Ucenik(3252, 19, ocene3);
        Ucenik ucenik4 = new Ucenik(3464, 24, ocene);

        ArrayList<Ucenik> dodatniUcenik = new ArrayList<>();
        dodatniUcenik.add(ucenik4);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(ucenik1);
        ucenici.add(ucenik2);
        ucenici.add(ucenik3);

        Fakultet faks = new DrzavniFakultet(ucenici);
        System.out.println("Broj uspešnih učenika na državnom faksu je: " + faks.uspesniUcenik());
        faks.zarada();

        Fakultet privatniFaks = new privatniFakultet(ucenici, dodatniUcenik);
        System.out.println("Broj uspešnih učenika na privatnom faksu je: " + privatniFaks.uspesniUcenik());
        privatniFaks.zarada();
    }
}
