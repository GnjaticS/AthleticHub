public class Zadatak3 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima 3 niza celih brojeva,
        // trazi minimum za svaki niz pa zatim vraca najmanji od ta tri
        int [] niz1 = {2, 4, 5, 3};
        int [] niz2 = {6, 3, 9};
        int [] niz3 = {3, 6, 3, 6, 8};
        System.out.println("Najmanji ćlan u od sva tri niza je " + najmanjiBroj(niz1, niz2, niz3));
    }
    public static int najmanjiBroj (int [] niz1, int [] niz2, int [] niz3) {
        int min = najmanji(niz1);
        if (najmanji(niz2) < najmanji(niz1) && najmanji(niz2) < najmanji(niz3)) {
            min = najmanji(niz2);
        } else if (najmanji(niz3) < najmanji(niz1) && najmanji(niz3)< najmanji(niz1)) {
            min = najmanji(niz3);
        }
        return min;
    }

    public static int najmanji (int [] niz1) {
        int najmanji = Integer.MAX_VALUE;
        for (int pivot:niz1) {
            if (pivot < najmanji){
                najmanji = pivot;
            }
        }
        return najmanji;
    }
}
