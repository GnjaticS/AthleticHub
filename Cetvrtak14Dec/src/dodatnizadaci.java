import java.util.Scanner;

public class dodatnizadaci {

     // Napisati program koji koristi metodu da proveri da li je uneta godina prestupna.

        public static int prestupna_godina (int a) {
            if (a % 4 == 0) {

            }
            return;
        }

    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesi godinu: ");
        int godina = skener.nextInt();
        godina = prestupna_godina(godina);

    }



}
