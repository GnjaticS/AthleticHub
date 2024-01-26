import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Uneti ceo broj preko skenera i inkrementovati ga, zatim istampati.
        /*Scanner skener = new Scanner(System.in);
        System.out.print("Unesi broj ovde: ");
        int broj = skener.nextInt();
        System.out.print("Unesi postotak: ");
        int postotak = skener.nextInt();
        double rezultat = (postotak / 100.00) * broj;


        System.out.println("Procenat broja " + broj + " od " + postotak + " je " + rezultat);
*/
        // Deklarisati i inicijalizovati dva broja,
        // izracunati njihov zbir i njihov proizvod i istampati sta je vece.

        /* System.out.println("Unesi prvi broj: ");
        Scanner skener = new Scanner(System.in);

        int broj3 = skener.nextInt();
        System.out.println("Unesi drugi broj: ");
        int broj4 = skener.nextInt();
        int proizvod = broj3 * broj4;
        int zbir = broj3 + broj4;

        if (proizvod > zbir) {
            System.out.println("Proizvod je veći od zbira. ");
        } else if (zbir > proizvod){
            System.out.println("Zbir je veći od proizvoda");
        } else {
            System.out.println("Proizvod i zbir su jednaki.");
        }
*/
        // Deklarisati i inicijalizovati neki ceo broj, ukoliko je deljiv sa 2,
        // istampati poruku zajedno sa brojem, ukoliko nije,  istampati poruku o tome.

        /*Scanner skener = new Scanner(System.in);
        System.out.print("Unesi neki broj: ");
        int broj = skener.nextInt();
        if (broj % 2 == 0) {
            System.out.println(broj + " je deljiv sa dva.");
        } else {
            System.out.println(broj + " nije deljiv sa dva");
        }
*/
        // Uneti broj godina preko Scannera, ukoliko imate 18 i vise,
        // ispisati poruku da mozete da konzumirate alkohol, u suprtonom ispisi da ne mozes.
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesi broj godina: ");
        int godine = skener.nextInt();
        if (godine >= 18) {
            System.out.println("Osoba može da konzumira alkohol.");
        } else {
            System.out.println("Osoba ne sme da konzumira alkohol.");
        }

        // Uneti preko Scannera naziv meseca u godini, ukoliko je unet Jul ili Avgust,
        // ispisati poruku da je vrucina prevelika,
        // u slucaju da je neki drugi mesec, ispisati poruku da nije tako strasno.
while (true) {
        System.out.println("Unesi naziv meseca ili 'kraj' za izlaz: ");
        String mesec = skener.next();
        if (mesec.equals("Jul") || mesec.equals("Avgust")) {
            System.out.println("Vrućina je prevelika!");
        } else if (mesec.equalsIgnoreCase("kraj")){
            System.out.println("Izlaz iz programa."); break;
        }
        else {
            System.out.println("Nije tako strašno. :P");
        }
    }
}}