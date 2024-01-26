package PrviZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(9);
        ocene.add(7);
        ocene.add(9);

        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(10);
        ocene2.add(7);
        ocene2.add(9);

        Ucenik ucenik1 = new Ucenik(22, 19, ocene);
        Ucenik ucenik2 = new Ucenik(21, 20, ocene2);

        ArrayList<Ucenik> listaUcenika = new ArrayList<>();
        listaUcenika.add(ucenik1);
        listaUcenika.add(ucenik2);

        Fakultet drzavni = new DrzavniFakultet(listaUcenika);
        System.out.println(drzavni.zarada());
        System.out.println(drzavni.brojUspesnih(listaUcenika));

        Fakultet privatni = new PrivatniFakultet(listaUcenika);
        System.out.println("Zarada na privatnom faksu je: " + privatni.zarada());
        System.out.println("Broj uspešnih učenika na privatnom faksu je: " + privatni.brojUspesnih(listaUcenika));
    }
}
