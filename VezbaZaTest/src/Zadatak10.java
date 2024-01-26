public class Zadatak10 {
    public static void main(String[] args) {
        //  Napisati program koji proverava da li je uneti niz palindrom.
        //  (primer kad je niz palindrom: int[] niz1 = {1,2,3,2,1}, int[] niz2 = {4,6,8,8,6,4}
        int [] niz = {1, 2, 4, 6, 4, 2, 1};
        System.out.println(palindromNiz(niz));
    }
    public static boolean palindromNiz (int [] niz) {
        int duzinaNiza = niz.length;
        int [] noviNiz = new int[duzinaNiza];
        for (int i =0; i<niz.length; i++){
            noviNiz[duzinaNiza-1-i] = niz[i];
        }
        for (int i =0; i<niz.length; i++) {
            if (niz[i] != noviNiz[i]) {
                return false;
            }
        }
        return true;
    }

}
