package DodatniZadatak;

public class Operacija {
    int prviBroj;
    double drugiBroj;

    public Operacija (int a, double b){
        this.prviBroj = a;
        this.drugiBroj = b;
    }
    public double sabiranje (){
        double zbir = prviBroj + drugiBroj;
        return zbir;
    }
    public double oduzimanje () {
        double razlika = prviBroj - drugiBroj;
        return razlika;
    }
    public double množenje () {
        double proizvod = prviBroj * drugiBroj;
        return proizvod;
    }
    public double deljenje (){
        double kolicnik = prviBroj / drugiBroj;
        return kolicnik;
    }
    public String toString () {
        return "Rezultat sabiranja zadatih brojeva je " + sabiranje() + "; njihova razlika je: " + oduzimanje() + "; njihov količnik je: " + deljenje() + ", a njihvov proizvod: " + množenje();
    }

}
