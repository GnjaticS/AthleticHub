public class Zadatak4 {
    public static void main(String[] args) {
        // Inicijalizovati dva niza, zatim napisati metodu koja ce sabrati sve
        // elemente oba niza koji se nalaze na parnim pozicijama i smestiti u jednu promenljivu.
        // Isto to uraditi sa elementima na neparnim pozicijama. Ispisati koja suma je veca
        //Parne pozicije su na indeksu 0, 2, 4, 6,.. itd Neparne pozicije 1, 3, 5,...
        int [] niz1 = {2, 4, 3, 2, 6};
        int [] niz2 = {1, 8, 3, 2, 2};
        System.out.println("veća suma je " + suma(niz1, niz2));

    }
    public static int suma (int [] a, int [] b){
        int countParni = 0;
        int neparni = 1;
        for (int i=0, j =0; i<a.length; i+=2) {
            countParni += a[i];
        }
        for (int i =0; i<b.length; i+= 2){
            countParni += b[i];
        }
        for (int i=1; i<a.length; i+=2) {
            neparni += a[i];
        }
        for (int i=1; i<b.length; i+=2){
            neparni+= b[i];
        }
        if (countParni>neparni) {
            return countParni;
        }
        return neparni;
    }

}
