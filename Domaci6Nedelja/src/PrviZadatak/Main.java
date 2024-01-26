package PrviZadatak;

public class Main {
    public static void main(String[] args) {


        Kupac kupac1 = new Kupac(12, "Egor");

        Kupac kupac2 = new Kupac(234, "Stefan");

        Kupac kupac3 = new Kupac(234, "Boris");

        kupac1.addProduct("milk");
        kupac1.addProduct("bread");
        kupac1.addProduct("bananas");

        kupac2.addProduct("milk");
        kupac2.addProduct("oranges");
        kupac2.addProduct("nutela");

        kupac3.addProduct("bread");
        kupac3.addProduct("milk");
        kupac3.addProduct("bread");


        System.out.println(kupac1);
        System.out.println(kupac1.ukupnaCena());
        System.out.println(kupac2);
        System.out.println(kupac2.ukupnaCena());
        System.out.println(kupac3);
        System.out.println(kupac3.ukupnaCena());



    }
}
