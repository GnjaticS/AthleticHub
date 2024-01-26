import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //Napraviti metodu fakotrijel koja za proslednjeni broj vraca njegov faktorijel.
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi neki broj: ");
        int a = skener.nextInt();
        System.out.println("faktorijel broja " + a + " je " + faktorijel(a));

    }
    public static int faktorijel (int a) {
        int fakt = 1;
        for (int i=1; i<=a; i++) {
            fakt *= i;
        }
        return fakt;
    }
}
