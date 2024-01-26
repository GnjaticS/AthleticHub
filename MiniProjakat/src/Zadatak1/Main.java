package Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StambeniObjekat kuca = new StambeniObjekat("Devet Jugovića", 124.00, 200.00);
        Stan stan1 = new Stan("Devet jugovića", 28.00, 600.00, true);
        Kuća kuća1 = new Kuća("Branimira Ćosića", 300.00, 500.00);
        Stan stan2 = new Stan("Desanke Maksimović", 34, 800, false);
        Stan stan3 = new Stan("Toplice Milana", 45, 900, false);

        ArrayList<StambeniObjekat> objekti = new ArrayList<>();
        objekti.add(stan1);
        objekti.add(kuca);
        objekti.add(kuća1);
        objekti.add(stan2);

        ArrayList<StambeniObjekat> objekti2 = new ArrayList<>();
        objekti2.add(stan1);
        objekti2.add(kuca);
        objekti2.add(kuća1);
        objekti2.add(stan2);
        objekti2.add(stan3);



        Agencija agens1 = new Agencija(objekti);
        // System.out.println(agens1.uPonudi("Devet Jugovića"));
        // System.out.println(agens1.uBudžetu(60000.00));
        System.out.println(agens1.izbaciBezTerase());
        // System.out.println(agens1.ukupnaCena());

        Agencija agens2 = new Agencija(objekti2);

        ArrayList Agencije = new ArrayList<>();
        Agencije.add(agens1);
        Agencije.add(agens2);

        AgencijskiPortal portal1 = new AgencijskiPortal(Agencije);
        // System.out.println(portal1.najvrednije());
        // portal1.ubaciAgenciju(agens1);

    }
}
