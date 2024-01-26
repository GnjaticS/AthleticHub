import java.util.Scanner;
public class Treći_čas {
    public static void main(String[] args) {
        // Unesi radnu poziciju, ako si masinovodja ispisati da imas platu 30000, ako si fizikalac, ispisati da imas platu 25000,
        // ako si sef ispisati platu od 50000. U slucaju da je uneta neka druga pozicija ispisati poruku o neispravnosti.

        Scanner skener = new Scanner(System.in);
        /* System.out.println("Unesi radnu poziciju: ");

        String radna_pozicija = skener.next();

        switch (radna_pozicija) {
            case "masinovodja":
                System.out.println("Mašinovođa ima platu 30000");
            break;
            case "fizikalac":
                System.out.println("Fizikalac ima platu 25000");
                break;
            case "šef":
                System.out.println("Šef ima platu od 50000");
                break;
            default:
                System.out.println("Nepostojeća radna pozicija");
        } */
        // Uneti preko Scanner-a naziv meseca u godini i ispisati koliko taj mesec ima dana.

        /* String mesec = skener.next();
        mesec.toLowerCase();


        switch(mesec) {
            case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println("Mesec ima 31 dan");
                break;
            case "april", "jun", "septembar", "novembar":
                System.out.println("Mesec ima 30 dana");
                break;
            case "februar":
                System.out.println("Mesec ima 28 dana");
                break;
            default:
                System.out.println("Nepravilan unos meseca.");
        }
        */

        // Clanstvo za knjizaru je 2000 dinara. Uneti vas status (Penzioner, student),
        // ukoliko ste penzioner vasa clanarina je 40% na popustu, ukoliko ste student onda 20% u suprotnom nema popusta.

       /* System.out.print("Uneti status korisnika (penzioner, student): ");
        String clan = skener.next();
        clan = clan.toLowerCase();
        int clasnarina = 2000;
        double popust1 = (40 / 100.00) * clasnarina;
        double popust2 = (20 / 100.00) * clasnarina;
        switch (clan) {
            case "penzioner":
                System.out.println("Vaša članarina je " + popust1);
                break;
            case "student":
                System.out.println("Vaša članarina je " + popust2);
                break;
            default:
                System.out.println("Nepravilan unos člana");

        }

        */
        // Napiši program koji traži od korisnika da unese dva broja i operaciju
        // (sabiranje, oduzimanje, množenje, deljenje). Korišćenjem switch iskoristi unetu operaciju i izračunaj rezultat.

        System.out.println("Unesi dva broja: ");
        double broj1 = skener.nextDouble();
        double broj2 = skener.nextDouble();
        skener.nextLine();
        System.out.println("Unesi operaciju: ");
        String operacija = skener.nextLine();
        double rezultat = 0;

        switch (operacija) {
            case "+":
                rezultat = broj2 + broj1;
                break;
            case "-":
                rezultat = broj1 - broj2;
                break;
            case "*":
                rezultat = broj2 * broj1;
                break;
            case "/":
                rezultat = broj1 / broj2;
                break;
            default:
                System.out.println("Neispravna operacija");
                break;
        }
        System.out.println("Rezultat tražene operacije između dva broja je: " + rezultat);
    }
}
