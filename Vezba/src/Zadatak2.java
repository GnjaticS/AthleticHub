public class Zadatak2 {
    public static void main(String[] args) {
        //Napraviti metodu koja prima neki niz brojeva i neki broj,
        // ukoliko se taj proslednjeni broj nalazi vise od 3 puta u tom nizu,
        // ispisati poruku da je nas broj presao granici, u suprotnom ispisati da nije presao granicu

        int [] niz = {3, 3, 3, 3, 2, 1, 6};
        int broj = 1;
        ponavljanje(niz, broj);
    }
    public static void ponavljanje (int [] niz, int broj) {
        int brojač = 0;
        for (int pivot:niz) {
            if (niz[pivot] == broj) {
                brojač++;}
        }
        if (brojač>3) {
            System.out.println("Broj je prešao granicu. ");
        } else {
            System.out.println("Broj nije prešao granicu. ");
        }
    }
}
