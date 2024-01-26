public class Dodatni_zadaci {
    public static void main(String[] args) {
        /*Zadatak 4:
Deklarisati i inicijalizovati 3 godine rodjenja i istampati u konzoli
koliko te osobe sada imaju godina.
         */
        int osoba1 = 1991;
        int osoba2 = 1969;
        int osoba3 = 2005;
        int trenutna_godina = 2023;

        System.out.println("Osoba 1 ima " + (trenutna_godina - osoba1) + " " + "godine. " + "Osoba 2 ima " +
                (trenutna_godina - osoba2) + " " + "godine. " + "Osoba 3 ima " + (trenutna_godina - osoba3)
                + " " + "godine. ");

        /* Majica kosta 1000 dinara, ispisati u
        konzoli njenu cenu nakon popusta od 20%.
         */
        double majica = 1000.00;
        double popust = (20.00/100) * 1000;
        double majica_sa_popustom = majica - popust;
        System.out.println("Majica sa popustom košta: " + majica_sa_popustom + " rsd.");

        /* Zadatak 6:
Bankar ima platu 90 000, istampati u konzoli njegovu platu ako
racunamo da izgubi prvo 10% na poreze pa zatim 15% za racune.
         */
        int plata = 90000;
        double smanjenje1 = (10.00/100) * plata;
        double plata2 = plata - smanjenje1;
        double smanjenje2 = (15.00/100) * plata2;
        double konacna_plata = plata2 - smanjenje2;
        System.out.println("Bankar sada ima platu od: " + konacna_plata);

    }
}
