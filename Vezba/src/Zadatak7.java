public class Zadatak7 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima 3 niza, racuna minimum za svaki niz i kao rezultat vraca zbir svih minimuma.
        int [] niz1 = {2, 4, 7};
        int [] niz2 = {1, 9, 3};
        int [] niz3 = {4, 5, 9};
        System.out.println("Zbir svih minimuma iz tri niza je: " + zbirMinimuma(niz1, niz2, niz3));
    }
    public static int zbirMinimuma (int [] niz1, int[] niz2, int[] niz3) {
        int zbir = min(niz1) + min(niz2) + min(niz3);
        return zbir;
    }
    public static int min (int [] niz1) {
        int najmanji = Integer.MAX_VALUE;
        for (int pivot:niz1) {
            if (pivot<najmanji) {
                najmanji = pivot;
            }
        }
        return najmanji;
    }
}
