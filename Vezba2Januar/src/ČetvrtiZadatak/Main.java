package ČetvrtiZadatak;

public class Main {
    public static void main(String[] args) {
        Knjiga knjiga1 = new Knjiga("Lovac u žitu", "Selindžer", 1958);
        knjiga1.info();
        Romani roman1 = new Romani("Roman o Londonu", "Miloš Crnjanski", 1967, "roman");
        roman1.info();
        NaučneKnjige naučne = new NaučneKnjige("Biologija", "Pero Perić", 1989, "biologija");
        naučne.info();
    }
}
