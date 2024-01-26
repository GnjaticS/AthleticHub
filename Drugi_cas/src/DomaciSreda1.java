import java.util.Scanner;
public class DomaciSreda1 {
    public static void main(String[] args) {
        // 1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        // Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem ključu:
        //Ako je ocena 5, slovna ocena je "Odlican".
        //Ako je ocena 4, slovna ocena je "Vrlo dobar".
        //Ako je ocena 3, slovna ocena je "Dobar".
        //Ako je ocena 2, slovna ocena je "Dovoljan".
        //Ako je ocena 1, slovna ocena je "Nedovoljan".

        /* Scanner skener = new Scanner(System.in);
        System.out.println("Unesi ocenu učenika: ");
        int ocena = skener.nextInt();

        switch (ocena) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odličan");
                break;
            default:
                System.out.println("Nepostojeća ocena");
                break;
        } */

        // Napisi program koji koristi for petlju da proveri da li je broj N prost. Korisnik treba da unese vrednost N,
        // a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom. Ispiši odgovarajuću poruku.

        /* Scanner skener = new Scanner(System.in);
        System.out.print("Unesi neki broj: ");
        int broj = skener.nextInt();
        int count = 0;

            for (int i = 1; i <= broj; i++) {
                if (broj % i == 0) {
                    count += 1;
                }
            }
        if (count == 2) {
            System.out.println("Broj je prost");
        } else {
            System.out.println("Broj nije prost");

        }

         */

        // Izbroj koliko puta se javlja slovo 'a' u unetom stringu.

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi neku rečenicu: ");
        String i = skener.nextLine().toLowerCase();

        int broj_pozicije = 0;

        int count = 0;

        for (broj_pozicije = 0; broj_pozicije < i.length(); broj_pozicije++){
            char pozicija = i.charAt(broj_pozicije);
            if (pozicija == 'a'){
                count++;
            }

        }
        System.out.println("broj slova 'a' u stringu je: " + count);

    }
}
