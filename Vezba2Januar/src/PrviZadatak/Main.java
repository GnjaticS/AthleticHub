package PrviZadatak;

public class Main {
    public static void main(String[] args) {
        Točak točak1 = new Točak(90, "A");
        System.out.println(točak1);

        BMW auto1 = new BMW(točak1, 25000, 2010, "bela");
        auto1.popustBMW();

        Mercedes merc1 = new Mercedes(točak1, 50000, 2020, "bela");
        merc1.zamenaTočka(točak1);

        Automobil auto2 = new Automobil(točak1, 30000, 2019, "siva");
        System.out.println(auto2);
        auto2.noviTočak(točak1);
    }
}
