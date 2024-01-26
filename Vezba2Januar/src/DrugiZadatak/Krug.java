package DrugiZadatak;

public class Krug extends Oblik{
    public double poluprečnik;
    public Krug(double poluprečnik) {
        this.poluprečnik = poluprečnik;
    }

    @Override
    public void površina() {
        System.out.println("Površina kruga je: " + 3.14 * poluprečnik * poluprečnik);
    }
}
