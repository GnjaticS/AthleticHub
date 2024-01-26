package ČetvrtiZadatak;

public class Romani extends Knjiga{
    private String žanr;
    public Romani(String naslov, String autor, int godinaIzdanja, String žanr) {
        super(naslov, autor, godinaIzdanja);
        this.žanr = žanr;
    }

    // prikaziInformacije(), koja override-uje osnovnu metodu i dodaje prikaz žanra.


    @Override
    public void info() {
        System.out.println(toString() + žanr);
    }
}
