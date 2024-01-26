package Domaci;

public class Main {
    public static void main (String[] args) {
    Banka osoba1 = new Banka(142524, "Stefan", 3000);
        System.out.println(osoba1);
        osoba1.uplata(400);
        osoba1.smanjenje(900);

        Banka osoba2 = new Banka(927362, "Goran", 4000);
        System.out.println(osoba2);
        osoba2.uplata(1200);
        osoba2.smanjenje(6000);

        Banka osoba3 = new Banka(9268346, "Miljana", 500);
        System.out.println(osoba3);
        osoba3.uplata(1000);
        osoba3.smanjenje(200);
    }

}
