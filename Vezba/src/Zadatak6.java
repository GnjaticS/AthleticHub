import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima platu nekog radnika,
        // zatim oduzima 15% na porez, od toga sto ostane oduzme 17% za racune, i vrati ostatak.
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesi platu nekog radnika: ");
        double a = skener.nextDouble();
        System.out.println("plata radnika nakon oduzetog poreza i plaćenih računa je: " + plata(a));
    }
    public static double plata (double a ){

        double porez = (15/100.00)*a;
        a = a - porez;
        double računi = (17/100.00) * a;
        a = a - računi;
        return a;
    }

}
