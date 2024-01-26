public class Zadatak3 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima pet nizova celih brojeva i racuna
        //maksimum za svaki niz, zatim racuna i vraca zbir tih maksimuma.
        int [] niz1 = {2, 5, 3, 1, 10};
        int [] niz2 = {5, 2, 1, 9};
        int [] niz3 = {3, 10, 13, 4};
        int [] niz4 = {4, 13, 2, 1};
        int [] niz5 = {2, 9, 20, 3};
        System.out.println("Zbir svih maksimuma u pet nizova je: " + zbirMaksimuma(niz1, niz2, niz3, niz4, niz5));

    }
    public static int zbirMaksimuma (int [] niz1, int [] niz2, int [] niz3, int [] niz4, int [] niz5) {
        int zbir = maksimum(niz1) + maksimum(niz2) + maksimum(niz3) + maksimum(niz4) + maksimum(niz5);
        return zbir;
    }
    public static int maksimum (int[] niz1) {
        int max = Integer.MIN_VALUE;
        for (int pivot:niz1) {
            if (pivot > max) {
                max = pivot;
            }
        }
        return max;
    }
}
