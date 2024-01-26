import java.util.Scanner;

public class chat {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata u nizu: ");
        int n = scanner.nextInt();

        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");

        // Unos elemenata niza
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        // Pronalaženje minimalnog i maksimalnog elementa u nizu
        int minimalni = niz[0];
        int maksimalni = niz[0];

        for (int i = 1; i < n; i++) {
            if (niz[i] < minimalni) {
                minimalni = niz[i];
            }
            if (niz[i] > maksimalni) {
                maksimalni = niz[i];
            }
        }

        // Računanje kvadrata razlike
        int razlika = maksimalni - minimalni;
        int kvadratRazlike = razlika * razlika;

        // Ispis rezultata
        System.out.println("Minimalni element u nizu: " + minimalni);
        System.out.println("Maksimalni element u nizu: " + maksimalni);
        System.out.println("Kvadrat razlike između minimalnog i maksimalnog elementa: " + kvadratRazlike);
    }
}