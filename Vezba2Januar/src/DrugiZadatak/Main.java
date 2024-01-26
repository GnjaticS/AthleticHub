package DrugiZadatak;

public class Main {
    public static void main(String[] args) {
        Oblik pravougaonik = new Pravougaonik(5, 3);
        pravougaonik.površina();

        Oblik trougao = new Trougao(8, 9);
        trougao.površina();

        Oblik krug = new Krug(8);
        krug.površina();
    }
}
