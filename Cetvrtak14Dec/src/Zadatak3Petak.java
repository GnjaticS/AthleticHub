public class Zadatak3Petak {
    // Napraviti metodu koja prima dva cela broja, racuna njihov zbir i
    // ispisuje nam poruku ukoliko je zbir paran ili neparan.
    /* public static void parnost (int a, int b) {
        int suma = a + b;
        if (suma%2==0) {
            System.out.println("suma dva broja je paran broj");
        } else {
            System.out.println("suma je neparna");
        }
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 12;
        parnost(a, b);
    }

     */
    public static String parnost(int a, int b) {
        int suma = a + b;
        if (suma%2==0) {
            return "Suma je parna";
        } else {
            return "suma je neparna";
        }
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        String parnost = parnost(a, b);
        System.out.println(parnost);
    }
}
