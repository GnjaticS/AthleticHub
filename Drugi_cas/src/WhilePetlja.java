import java.util.Scanner;
public class WhilePetlja {
    public static void main(String[] args) {
       Scanner skener = new Scanner(System.in);
        // Uneti neki broj preko konzole. Kao rezultat vratiti sumu parnih brojeva do tog broja
        /* System.out.print("Unesi neki broj: ");
        int broj = skener.nextInt();
        int suma = 0;
        while (broj>=0) {
            if (broj % 2 == 0) {
                suma += broj;

            } broj --;

        }
        System.out.println(suma); */


        // Uneti neki String preko konzole sve dok ne unesemo "." Kao rezultat istampati sta smo pre te tacke uneli.
        /* System.out.println("Unesi neku rečenicu, a unesi . za kraj: " );
        String reč = skener.nextLine();

        while (!reč.equalsIgnoreCase(".")) {
            System.out.println(reč);
            reč = skener.nextLine();
        }

         */

        // Inicijalizovati neku int promenljivu 1-10.
        // Zatim u konzoli pokusajte da pogodite koji ste broj uneli, takodje ispisati i broj pokusaja koji je trebao.

        /* System.out.print("Unesi broj od 1 do 10: ");
        int broj = skener.nextInt();
        int broj_pokusaja = 0;

        while (broj >=1 && broj <= 10) {
            if (broj == 7) {
                System.out.println("tačan broj");
                break;
            } else if (broj < 7) {
                System.out.println("probaj ponovo (veći broj)");
                broj_pokusaja++;
                broj = skener.nextInt();
            } else if (broj > 7) {
                System.out.println("probaj ponovo (manji broj)");
                broj_pokusaja++;
                broj = skener.nextInt();
            }

        }
        System.out.println("broj pokušaja je: " + broj_pokusaja);

         */

        // Ucititavati brojeve sve dok se ne unese broj 0. Ispisati minimalan broj koji je unet.

        System.out.print("Unesi neki broj (uneti 0 za izlaz): ");
        int min = Integer.MAX_VALUE;
        int broj = skener.nextInt();

        while (broj != 0) {
            System.out.print("Unesi novi broj(0 za izlaz): ");

            if (broj < min) {

                min = broj;
            }
            broj = skener.nextInt();

        }
        System.out.println("Najmanji unet broj je: " + min);

         

        // Uzeti brojeve od 1 do 100 i izracunati:
        //-sumu parnih
        //-sumu neparnih
        //-sumu prostih // deljivi sa 1 i samim sobom

        /* int brojevi = 1;
        int suma = 0;
        while (brojevi >= 1 && brojevi <= 100) {
            brojevi ++;
            if (brojevi % 2 == 0) {
                suma += brojevi;
            }
        }
        System.out.println(suma);

         */

        // Ucititavati brojeve sve dok se ne unese broj 0. Ispisati minimalan broj koji je unet.




    }

}
