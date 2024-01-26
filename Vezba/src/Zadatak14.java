public class Zadatak14 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima neka dva broja a i b, zatim stampa sve
        // parne brojeve od veceg ka manjem(ukoliko je a veci od b, stampati sve parne od b do a, u suprotnom od a do b).
        parni(2, 10);
        System.out.println("between");
        parni(13, 1);

    }
    public static void parni (int a, int b) {
        int smallest = Integer.min(a, b);
        smallest += (smallest % 2);
        int biggest = Integer.max(a, b);
        for (; smallest<=biggest; smallest+=2)
            System.out.println(smallest);
    }
}
