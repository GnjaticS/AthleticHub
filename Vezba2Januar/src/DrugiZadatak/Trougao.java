package DrugiZadatak;

public class Trougao extends Oblik{
    private double osnovica;
    private double visina;

    // Trougao:
    //Nasleđuje Oblik.
    //promenljive osnovica i visina
    //Konstruktor: Postavlja vrednosti za osnovicu i visinu.
    //Metoda: Override-ovana izracunajPovrsinu(), koja računa površinu trougla.
    public Trougao(double osnovica, double visina) {
        this.osnovica = osnovica;
        this.visina = visina;
    }

    @Override
    public void površina() {
        System.out.println("Površina trougla je: " + visina * osnovica * 0.5);
    }

}
