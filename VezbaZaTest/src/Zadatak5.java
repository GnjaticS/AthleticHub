import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        // Napisati program koji koristi metodu da proveri da li je uneta godina prestupna.
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesi godinu: ");
        int godina = skener.nextInt();
        if (prestupna(godina)) {
            System.out.println("Godina je prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }

    }
    public static boolean prestupna (int godina) {
        if ((godina%4==0 && godina%100 !=0) || (godina%4 == 0 && godina%400 ==0)) {
            return true;
        }
        return false;
    }
}
