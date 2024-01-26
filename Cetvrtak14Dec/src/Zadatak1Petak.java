public class Zadatak1Petak {
    public static void main(String[] args) {
        // Napraviti metode za sledece operacije:
        //oduzimanje
        //mnozenje
        //deljenje

        double a = 12.0;
        double b = 3.0;
        double zbir = sabiranje(a, b);
        double proizvod = množenje(a, b);

        double količnik = deljenje(a, b);
        System.out.println("Zbir brojeve je: " + zbir);
        System.out.println("Proizvod brojeva je: " + proizvod);
        System.out.println("Količnik brojeva je: " + količnik);

    }
    public static double sabiranje(double a, double b) {
        double zbir = a + b;
        return zbir;
    }
    public static double množenje(double a, double b) {
        double proizvod = a * b;
        return proizvod;
    }
    public static double deljenje(double a, double b) {
        double količnik = a / b;
        return količnik;
    }


}
