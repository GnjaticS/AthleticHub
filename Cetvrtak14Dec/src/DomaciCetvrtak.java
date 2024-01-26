import java.util.Scanner;

public class DomaciCetvrtak {
    public static void main(String[] args) {
        // Zadatak1: Napisati program koji trazi od korisnika da unese niz celih brojeva,
        // pronalazi minimalni i maksimalni element u nizu i racuna kvadrat njihove razlike.

        /* Scanner skener = new Scanner(System.in);
        System.out.print("Unesi broj članova niza: ");
        int brojČlanova = skener.nextInt();

        int [] niz = new int[brojČlanova];

        for (int i = 0; i<niz.length; i++) {
            System.out.println("Element " + (i + 1) + ":");
            niz[i] = skener.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            } else if (niz[i]>max){
                max = niz [i];
            }
        }
        int razlika = max - min;
        int kvadrat_razlike = razlika * razlika;
        System.out.println("Najmanji broj u nizu je: " + min);
        System.out.println("Najveći broj u nizu je: " + max);
        System.out.println("Razlika maksimalnog i minimalnog broja niza je: " + razlika + ", a kvadrat njihove razlike: " + kvadrat_razlike);

         */

        // Zadatak2: Napisati program koji trazi od korisnika da unese niz celih brojeva, zatim vraca odgovor da li je
        // veca apsolutna vrednost zbira pozitivnih brojeva ili
        // apsolutna vrednost zbira negativnih brojeva. Funkcija za dobijanje apsoultne vrednosti broja je: Math.abs(broj).

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi broj članova niza: ");
        int brojČlanova = skener.nextInt();

        int [] niz = new int[brojČlanova];

        System.out.println("Unesi članove niza: ");
        for(int i=0; i<niz.length; i ++) {
            niz[i] = skener.nextInt();
            System.out.println("Član 1: " + niz[i]);
        }
        int suma_negativnih = 0;
        int suma_pozitivnih = 0;
        for (int j = 0; j < niz.length; j++) {
            if (niz[j]<0) {
                suma_negativnih += niz[j];
            } else {
                suma_pozitivnih += niz[j];
            }
        }
        int apsolutna_neg = Math.abs(suma_negativnih);
        int apsolutna_poz = Math.abs(suma_pozitivnih);
        if (apsolutna_poz > apsolutna_neg) {
            System.out.println("Apsolutna vrednost zbira svih pozitivni brojeva je veća od apsolutne vrednosti zbira svih negativnih brojeva");
        } else if (apsolutna_poz < apsolutna_neg){
            System.out.println("Apsolutna vrednost zbira svih negativnih brojeva je veća od apsolutne vrednosti zbira svih pozitivnih brojeva");
        } else {
            System.out.println("Apsolutna vrednost zbira pozitivnih i negativnih brojeva je jednaka. ");
        }
    }
}
