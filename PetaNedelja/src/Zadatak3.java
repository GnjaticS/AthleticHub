public class Zadatak3 {
    // Napraviti metodu koja prima dva broja a i b,
    // ukoliko je a(prvi broj) veci vratiti true, u suprotnom false.

    public static boolean brojevi (int a, int b) {
        if (a > b) {
return true;
        } else if (b > a) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        boolean rezultat = brojevi(a, b);
        System.out.println(rezultat);
    }
    // Napraviti metodu koja prima dva cela broja i izracunava razliku tako sto veci oduzima od manjeg.
}
