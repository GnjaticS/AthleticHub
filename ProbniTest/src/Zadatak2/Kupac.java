package Zadatak2;

public class Kupac {
    private Korpa korpa;
    private double vaučerZaKupovinu;
    private double svotaNovca;

    public Kupac(Korpa korpa, double vaučerZaKupovinu, double svotaNovca) {
        this.korpa = korpa;
        this.vaučerZaKupovinu = vaučerZaKupovinu;
        this.svotaNovca = svotaNovca;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public double getVaučerZaKupovinu() {
        return vaučerZaKupovinu;
    }

    public void setVaučerZaKupovinu(double vaučerZaKupovinu) {
        this.vaučerZaKupovinu = vaučerZaKupovinu;
    }

    public double getSvotaNovca() {
        return svotaNovca;
    }

    public void setSvotaNovca(double svotaNovca) {
        this.svotaNovca = svotaNovca;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                "korpa=" + korpa +
                ", vaučerZaKupovinu=" + vaučerZaKupovinu +
                ", svotaNovca=" + svotaNovca +
                '}';
    }

    public Namirnica najskuplji() {
        double najskupljaNamirnica = Double.MIN_VALUE;
        Namirnica nam1 = null;
        for (Namirnica nam: korpa.getListaNamirnica()){
            if (nam.getCena()> najskupljaNamirnica){
                najskupljaNamirnica = nam.getCena();
                nam1 = nam;
            }
        }
        return nam1;
    }

    // skratiKorpu() - u slucaju da kupac ima manje para nego sto mu treba, izbacuje artikl po artikl sve dok ne bude imao
    //dovoljno para.

    public void skratiKorpu () {
        for (Namirnica nam: korpa.getListaNamirnica()){
            if (svotaNovca<nam.getCena()){
                korpa.getListaNamirnica().remove(nam);
            }
        }
    }

    // ubaci(Artikl a) - ubacuje artikl u korpu, ukoliko kupac ima dovoljno para za to.

    public void ubaci(Namirnica n) {
        if (svotaNovca>= n.getCena()){
            korpa.getListaNamirnica().add(n);
        }
    }
}

// najskuplji() - vraca najskuplji artikl iz korpe


