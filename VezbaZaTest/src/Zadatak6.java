import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        // Napisati program koji koristi metodu za
        // pretragu odredjenog elementa u nizu i vracanje njegove pozicije.
        int [] niz = {2, 5, 2, 9};
        pozicija(niz);
    }
    public static void pozicija (int [] niz) {
        Scanner skener = new Scanner(System.in);
        System.out.println("unesi neki broj: ");
        int broj = skener.nextInt();
        for (int i=0; i<niz.length; i++) {
            if (niz[i] == broj) {
                System.out.println("Pozicija broja u nizu je: " + i);
            }
        }
    }
}
