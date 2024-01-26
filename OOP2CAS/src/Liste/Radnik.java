package Liste;

public class Radnik {

    // Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
    // Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
    // ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima staz
    // duzi od 10 godina.
    // Napraviti adekvatan konstruktor, get i set metod, kao i toString.
    String ID;
    int godinaZaposlenja;
    int palta;

    private Radnik (String a, int b, int c) {
        this.ID = a;
        this.godinaZaposlenja = b;
        this.palta = c;
    }
    private void staz () {
        int a = 2023 - godinaZaposlenja;
        System.out.println(a);
    }
    private int povisica () {
        if
    }

}
