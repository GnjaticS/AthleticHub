package Zadatak1;

public class Main {
    public static void main(String[] args) {
        Računar komp = new Računar("Intel", 16, true, true);
        komp.povezanSaInternetom();
        komp.isključiInternet();
        komp.isPovezanNaNet();
        komp.isUključen();

        Štampač printer = new Štampač("Obostrano", true, true);
        printer.ugasi();
        printer.upali();

    }
}
