package Zadatak1;

public class Štampač implements Upaljiv{
    private String tipŠtampe;
    private boolean kolor;
    private boolean uključen;

    public Štampač(String tipŠtampe, boolean kolor, boolean uključen) {
        this.tipŠtampe = tipŠtampe;
        this.kolor = kolor;
        this.uključen = uključen;
    }

    @Override
    public void upali() {
        uključen = true;
        System.out.println("Uređaj je uključen");
    }

    @Override
    public void ugasi() {
        uključen = false;
        System.out.println("Uređaj je isključen");
    }

}
