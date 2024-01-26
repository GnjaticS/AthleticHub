import java.util.Scanner;
public class drugi_zadatak {
    public static void main(String[] args) {
    Scanner skener = new Scanner(System.in);

    // Uneti jedan broj preko skenera, ukoliko je taj broj 13 ili 23 ili 31,
        // ispisati poruku da je u pitanju slozen broj, u suprotnom ispisati
        // poruku da je prost broj.



        while (true) {
            System.out.println("Unesi neki broj ili 0 za kraj programa: ");
            int broj = skener.nextInt();
            if (broj == 13 || broj == 23 || broj == 31) {
                System.out.println("Ovo je prost broj");
            } else if (broj == 0) {
                System.out.println("kraj programa."); break;
            } else {
                System.out.println("Broj je složen.");
            }
        }
    }
}
