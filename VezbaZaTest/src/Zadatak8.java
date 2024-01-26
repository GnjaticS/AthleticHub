import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        // Napisati program koji koristi metodu da proveri da li je uneti broj prost.
        Scanner skener = new Scanner(System.in);
        System.out.println("unesi neki broj: ");
        int a = skener.nextInt();
        if (prostBroj(a)) {
            System.out.println("broj je prost");
        } else {
            System.out.println("broj nije prost");
        }
    }
    public static boolean prostBroj (int a) {
        for (int i=2; i<a; i++){
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
}
