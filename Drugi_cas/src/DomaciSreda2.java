import java.util.Scanner;
public class DomaciSreda2 {
    public static void main(String[] args) {
        //  1. zadatak:
        //  Napisi program koji koristi do-while petlju
        //  da omoguci korisniku unos lozinke sve dok ne unese ispravnu lozinku.
        //  Ispravna lozinka moze biti unapred inicijalozovana.

        /* System.out.print("Unesi lozinku: ");
        Scanner skener = new Scanner(System.in);
        String lozinka = skener.next();
        String tačna_lozinka = "praskozorje";

        do {
            if (lozinka.equalsIgnoreCase(tačna_lozinka)) {
                System.out.println("Uspešan login");
                break;
            } else {
                System.out.println("Netačna lozinka");
                System.out.println("Pokušaj ponovo: ");
                lozinka = skener.next();
            }
        } while (true);

         */

        // 2. zadatak:
        // Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program treba da ispise
        // rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja sve dok drugi broj nije razlicit od nule.

        Scanner skener = new Scanner(System.in);
        while (true) {
            System.out.print("Unesi prvi broj: ");
            double broj1 = skener.nextDouble();
            System.out.print("Unesi drugi broj: ");
            double broj2 = skener.nextDouble();
            double rezultat = broj1 / broj2;
            if (broj2 == 0) {
                break;
            }
            System.out.println("Rezultat deljenja dva broja je: " + rezultat);
        }



    }
}
