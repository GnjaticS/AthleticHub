public class Zadaci {
    public static void main(String[] args) {
        // Napraviti niz imena.Iterirati kroz niz dok ne naidjete na ime "Jelena",
        // cim naidjete na to ime, ispisati poruku i prekinuti program da ne trazi dalje.
        /* String[] niz = {"Stefan", "Ivan", "Damir", "Horvat", "Jelena", "Đorđe"};


        for (int i = 0; i<niz.length; i++) {
            if (niz[i].equalsIgnoreCase("Jelena")) {
                System.out.println("Pronađeno ime Jelena. ");
                break;
            }


            }

         */

        // Proveriti da li su dva niza jednaka.
        // (Nizovi su jednaki ako imaju isti broj elemenata, i ako se na svakom  mestu,
        // nalazi isti element).

        int [] niz1 = {2, 3, 1, 4, 2};
        int [] niz2 = {2, 3, 1, 1, 2};
        int count = 0;
        for (int i = count; i<niz2.length; i ++) {
            if (niz1[i] == niz2[i]) {
                count++;
            } else {
                break;
            }
            System.out.println("Nizovi su jednaki");
        }

    }
}
