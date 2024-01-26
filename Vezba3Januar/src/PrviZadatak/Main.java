package PrviZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Glumac actor1 = new Glumac("Petar", "Božović", 35);
        Glumac actor2 = new Glumac("Žarko", "Laušević", 28);
        Glumac actor3 = new Glumac("Petar", "Kralj", 44);

        ArrayList<Glumac> listaGlumaca = new ArrayList<>();
        listaGlumaca.add(actor1);
        listaGlumaca.add(actor2);
        listaGlumaca.add(actor3);

        Film film1 = new Film("Braća po materi", 1989, listaGlumaca);
        film1.najmlađi();
        film1.najmlađiIme();
        System.out.println(film1.najmlađi());
        System.out.println(film1.najmlađiIme());

    }
}
