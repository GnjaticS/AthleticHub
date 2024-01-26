public class Zadatak9 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima broj i niz brojeva, proverava da li se taj broj nalazi u tom nizu .
        int broj = 3;
        int [] niz = {2, 4};
        System.out.println(proveraBroja(broj, niz));
    }
    public static boolean proveraBroja (int broj, int [] niz) {
        for (int i:niz) {
            if (i == broj) {
                return true;
            }
        }
        return false;
    }
}
