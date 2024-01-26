package ČetvrtiZadatak;

public class NaučneKnjige extends Knjiga{
    private String naučnaOblast;
    public NaučneKnjige(String naslov, String autor, int godinaIzdanja, String naučnaOblast) {
        super(naslov, autor, godinaIzdanja);
        this.naučnaOblast= naučnaOblast;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(toString() +"naučna oblast: " + naučnaOblast);
    }
}
