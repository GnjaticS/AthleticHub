public class Zadatak8 {
    public static void main(String[] args) {
        // 4. Napisati metodu koja prima 2 niza celih brojeva, iterira kroz oba niza, zatim
        //1) za sve elemente iz prvog niza cija je vrednost manja od 3, menja tu vrednost na 0
        //2) za sve elemente iz drugog niza cija je vrednost deljiva sa 3 menja tu vrenost na 0
        //Zatim ispisati cija suma elemenata je veca
        int [] niz1 = {2, 4, 5, 1};
        System.out.println(noviNiz(niz1));
    }
    public static int [] noviNiz (int [] niz1){
        int duzina = niz1.length;
        int [] novi = new int[duzina];
        for (int i= 0; i<niz1.length; i++) {
            if (niz1[i]<3) {
                niz1[i] = 0;
            }
        }
        for (int j=0; j<novi.length; j++) {
            for (int k = 0; k<niz1.length; k++) {
                novi[j] = niz1[k];
            }
        }
        return novi;
    }
}
