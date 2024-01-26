public class Main {
    public static void main(String[] args) {
        /* 1. Napisati program u Javi koji racuna povrsinu i obim pravougaonika sa zadatim
        dimenzijama a = 9 i b = 7 (dužine stranica). Ispisi rezultat.
         */

        int a = 9;
        int b = 7;
        int površina = a * b;
        int obim = 2*(a + b);
        System.out.println("Prvi zadatak");
        System.out.println("Površina zadatog pravougaonika je" + " " + površina + " kvadratnih cm"
        + ", a njegov obim je" + " " + obim + " " + "cm.");

        /* 2. String s1 = "bootcamp qa" i s2 = "xvii generacija" spojiti u novi string i ispisati
        ga u konzoli tako da sva slova budu velika.
         */
        String s1 = "bootcamp qa";
        String s2 = "xvii generacija";
        String noviString = s1.concat(" ").concat(s2);
        System.out.println("Drugi zadatak");
        System.out.println(noviString.toUpperCase());

        /* 3. a) Podeliti broj 80 sa 31
   b) zatim pomnoziti dobijeni rezultat i ostatak pri deljenju ta dva broja
   c) izracunati koliko je 10% od odbijene vrednosti

         */
        int c = 80;
        double d = 31;
        double kolicnik = c / d;
        double ostatak = c % d;
        double proizvod = kolicnik * ostatak;
        double procenat = (10.0/100) * proizvod;
        System.out.println("Treći zadatak");
        System.out.println("a) " + "kolicnik dva broja je: " + kolicnik);
        System.out.println("b) " + " ostatak pri deljenju je: " + ostatak);
        System.out.println("b) " + " proizvod kolicnika i dobijenog ostatka je: " + proizvod);
        System.out.println("c) " + "10% od dobijene vrednosti je: " + procenat);
    }
}