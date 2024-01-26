package TreciZadatak;

public class Main {
    public static void main(String[] args) {
        Hrana artikal1 = new Hrana("mleko", 150, 4, 40);
        System.out.println(artikal1);
        System.out.println(artikal1.ukupnaCena());

        var artikal2 = new Hrana("oranges", 120, 1, 0);
        System.out.println(artikal2);
        System.out.println(artikal2.ukupnaCena());

        var tehnika1 = new Tehnika("telefon", 400, 23, 200);
        System.out.println(tehnika1);
        System.out.println(tehnika1.ukupnaCena());

        var tehnika2 = new Tehnika("tv", 500, 12, 5000);
        System.out.println(tehnika2);
        System.out.println(tehnika2.ukupnaCena());

    }
}
