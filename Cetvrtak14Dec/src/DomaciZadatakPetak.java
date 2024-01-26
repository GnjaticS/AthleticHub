import java.util.Scanner;
public class DomaciZadatakPetak {
    //  Zadatak1: Napisati program koji koristi metodu da proveri da li su dva uneta niza jednaka.
    /* public static boolean proveraNizova (int[] a, int[] b) {
        int i = 0;
        boolean niz = false;
        while ((a.length == b.length) && i< a.length) {
            if (a[i] == b[i]) {
                niz = true;
                i++;

            } else {
                niz = false;
                break;

            }

        } return niz;

    }

    public static void main(String[] args) {
        int [] prviNiz = {2, 4, 6, 8};
        int [] drugiNiz = {2, 4, 6, 8};
        if (proveraNizova(prviNiz, drugiNiz)){
            System.out.println("Dva niza su jednaka.");
        } else {
            System.out.println("Dva niza nisu jednaka");
        }

    }

     */
    /*
    // Zadatak2: Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.

    public static double kvadrat(double a) {
        double kvadrat = Math.pow(a, 2);
        return kvadrat;
    }
    public static double koren (double a) {
        double koren = Math.sqrt(a);
        return koren;
    }

    public static void main(String[] args) {
        double a = 9;
        System.out.println("Kvadrat datog broja je " + kvadrat(a) + ", a njegov koren " + koren(a));
    }

     */
    // Zadatak3: Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.

    public static int faktorijel (int a) {
        int count = 1;
        int faktorijel = a;

        while (count < a) {
            faktorijel *= count;
            count ++;
        }
        return faktorijel;

    }

    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesi neki broj: ");
        int a = skener.nextInt();
        System.out.println("Faktorijel broja " + a + " jeste: " + faktorijel(a));
    }

}
