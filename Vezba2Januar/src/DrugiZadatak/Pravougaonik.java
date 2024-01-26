package DrugiZadatak;

public class Pravougaonik extends Oblik{
    public int visina;
    public int širina;



    public Pravougaonik(int a, int b) {
        super();
        this.visina = a;
        this.širina = b;
        }

    @Override
    public void površina() {
        System.out.println("Površina pravougaonika je: " + visina * širina);
    }
}
