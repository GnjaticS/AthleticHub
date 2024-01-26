import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima neki pozitivan ceo broj i ispisuje sve neparne brojeve od 0 do tog broja.
        Scanner skener = new Scanner(System.in);
        System.out.println("unesi neki broj");
        int a = skener.nextInt();
        neparni(a);
    }
    public static void neparni (int a) {
        for (int i=0; i<a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
