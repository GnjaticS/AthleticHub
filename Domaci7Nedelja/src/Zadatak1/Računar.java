package Zadatak1;

public class Računar implements InternetPovezan, Upaljiv{
    private String tipProcesora;
    private int RAM;
    private boolean uključen;
    private boolean povezanNaNet;

    public Računar(String tipProcesora, int RAM, boolean uključen, boolean povezanNaNet) {
        this.tipProcesora = tipProcesora;
        this.RAM = RAM;
        this.uključen = uključen;
        this.povezanNaNet = povezanNaNet;
    }

    public String getTipProcesora() {
        return tipProcesora;
    }

    public void setTipProcesora(String tipProcesora) {
        this.tipProcesora = tipProcesora;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public boolean isUključen() {
        return uključen;
    }

    public void setUključen(boolean uključen) {
        this.uključen = uključen;
    }

    public boolean isPovezanNaNet() {
        return povezanNaNet;
    }

    public void setPovezanNaNet(boolean povezanNaNet) {
        this.povezanNaNet = povezanNaNet;
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

    @Override
    public void povezanSaInternetom() {
        if (uključen) {
            povezanNaNet = true;
            System.out.println("Uređaj je povezan na internet");
        } else {
            System.out.println("Racunar nije ukljucen, ne može se isključiti internet.");
        }
    }
    @Override
    public void isključiInternet() {
        if (uključen) {
            povezanNaNet = false;
            System.out.println("Internet je isključen");
        } else {
            System.out.println("Racunar nije ukljucen, ne može se isključiti internet.");
        }
    }

}
