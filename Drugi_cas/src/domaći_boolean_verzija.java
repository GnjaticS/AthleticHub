import java.util.Scanner;
public class domaći_boolean_verzija {
    public static void main(String[] args) {

        // boolean verzija
        Scanner skener = new Scanner(System.in);

        System.out.print("Unesi informacije o članstvu(penzioner ili student): ");
        String informacija = skener.next();
        boolean student = informacija.equalsIgnoreCase("student");
        boolean penzioner = informacija.equalsIgnoreCase("penzioner");
        System.out.print("Unesi broj uplate: ");
        int broj_uplate = skener.nextInt();
        if ((student || penzioner) && broj_uplate == 1){
            System.out.println("Korisnik ima pravo na 30% popusta");
        }
        System.out.print("Unesi godine i informacije o studentu: ");
        int godine = skener.nextInt();
        informacija = skener.next();
        if ((student && godine < 26) || (penzioner && godine > 60)) {
            System.out.println("Korisnik ima pravo na popust od 15%");
        } else {
            System.out.println("Korisnik plaća punu cenu od 3500 rsd");
        }
        System.out.print("Unesi broj meseci članstva: ");
        int broj_meseci = skener.nextInt();
        if (broj_meseci >= 12) {
            System.out.println("Korisnik ima pravo na 20% popusta");
        } else if (broj_meseci >= 6 && broj_meseci < 12) {
            System.out.println("Korisnik ima pravo na 10% popusta");
        } else if (broj_meseci >= 3 && broj_meseci < 6) {
            System.out.println("Korisnik ima pravo na 5% popusta");
        } else {
            System.out.println("Korisnik plaća punu cenu od 3500 rsd");
        }

    }
}
