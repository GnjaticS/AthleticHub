package Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Staza staza1 = new Staza("dragon", 32);
        Staza staza2 = new Staza("wolf", 44);
        Staza staza3 = new Staza("tiger", 88);
        Staza staza4 = new Staza("eagle", 44);
        ArrayList<Staza> listaStaza = new ArrayList<>();
        listaStaza.add(staza1);
        listaStaza.add(staza2);
        listaStaza.add(staza3);
        listaStaza.add(staza4);

        Maratonac maratonac1 = new Maratonac(23, listaStaza);
        Maratonac maratonac2 = new Maratonac(34, listaStaza);
        Maratonac pro1 = new Profesionalac(43, listaStaza);
        Maratonac am1 = new Amater(13, listaStaza);
        Maratonac m = new Maratonac(45, listaStaza);

        ArrayList<Maratonac> listaM = new ArrayList<>();
        listaM.add(maratonac1);
        listaM.add(maratonac2);
        listaM.add(am1);
        listaM.add(pro1);

        Maraton m1 = new Maraton(listaM, 51.00);
        // m1.ubaci(m);
        m1.ubaci(m);


        System.out.println(m1.nađiStazu(staza2));


        // m1.izbaci();
        // System.out.println(m1);
        System.out.println(maratonac1.najduza());
        System.out.println(maratonac1.humanitarnaAkcija());
        System.out.println(am1.humanitarnaAkcija());






    }
}
