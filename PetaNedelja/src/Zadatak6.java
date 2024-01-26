public class Zadatak6 {
    // Napraviti metodu koja prima niz brojeva, i broji parne brojeve u tom nizu.

    public static int brojParnih (int [] a) {
        int brojač = 0;
        for (int i = 0; i<a.length; i++) {

            if (a[i] % 2== 0) {
                brojač++;
            }
        }
        return brojač;

    }

    public static void main(String[] args) {
        int [] a = {2, 4, 23, 35, 1, 8};
        System.out.println("Broj parnih brojeva je: " + brojParnih(a));

    }
}
