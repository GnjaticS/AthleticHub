import java.util.Scanner;
public class Vezba {
    public static void main(String[] args) {
        // Uneti broj preko Scannera, ukoliko je taj broj veci od 10 i paran,
        // ispisati poruku o tome, ukoliko je
        // veci od 10 i neparan, ispisati poruku u tome, u
        // suprtonom ispisati poruku da je manji od 10.
        Scanner skener = new Scanner(System.in);

        while (true) {
            System.out.println("Unesi neki broj ili '0' za izlaz iz programa: ");
            int broj = skener.nextInt();

            if (broj > 10 && broj % 2 == 0) {
                System.out.println("Broj je veći od 10 i paran je. ");
            } else if (broj > 10 && broj % 2 != 0) {
                System.out.println("Broj je veći od 10 i neparan je. ");
            } else if (broj == 10) {
                System.out.println("Broj je 10 i paran je. ");
            }
            else if (broj == 0) {
                System.out.println("kraj programa."); break;
            }
            else {
                System.out.println("Broj je manji od 10. ");
            }
        }




    }
}
