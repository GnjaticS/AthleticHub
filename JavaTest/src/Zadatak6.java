import java.util.Arrays;

public class Zadatak6 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima dva niza celih brojeva i kao rezultat vraca
        //konkatenaciju ta dva niza (spojiti dva niza u jedan veci niz).
        int [] niz1 = {2, 4, 6, 3, 12};
        int [] niz2 = {1, 5, 2, 8};
        System.out.println(Arrays.toString(konkatenacija(niz1, niz2)));

    }
    public static int [] konkatenacija (int [] niz1, int [] niz2) {
        int duzinaNiza1 = niz1.length;
        int duzinaNiza2 = niz2.length;
        int count = 0;
        int [] noviNiz = new int[duzinaNiza2 + duzinaNiza1];
        for (int i =0; i<niz1.length; i++) {
            noviNiz[count] = niz1[i];
            count++;
        }
        for (int i =0; i<niz2.length; i++){
            noviNiz[count] = niz2[i];
            count++;
        }

        return noviNiz;
    }
}
