public class Radnik {
    // Zadatak 2:
    //Napraviti klasu Radnik koja ima:
    //- id
    //- platu
    //- godinu zaposlenja
    // takodje ima metodu za racunanje radnog staza, metodu za racunanje ukupne zarade od kad se
    // radnik zaposlio i metodu za bonus koji daje radniku povisicu od 40% ukoliko je tu duze od 10 godina.
    // Klasa Fizikalac nasledjuje klasu Radnik. Klasa Masinovodja nasledjuje klasu Radnik, poseduje dodatni atribut za
    // osiguranje(boolean) i od ukupne zarade koju je radnik do tada zaradio oduzima 10% zbog osiguranja.
    // Klasa Sef nasledjuje klasu Radnik i ukoliko je sef tu duze od 10 godina, dobija povisicu od 60%.

    private int id;
    private double plata;
    private int godinaZaposlenja;

    public Radnik (int a, int b, int c){
        this.id = a;
        this.plata = b;
        this.godinaZaposlenja = c;
    }

    public int getId (){
        return id;
    }
    public void setId (int noviID) {
        this.id = noviID;
    }
    public double getPlata (){
        return plata;
    }
    public void setPlata (double novaPlata) {
        this.plata = novaPlata;
    }
    public int getGodinaZaposlenja(){
        return godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int novaGodina) {
        this.godinaZaposlenja = novaGodina;
    }
    public String toString () {
        return id + " " + plata + " " + godinaZaposlenja;
    }
    public int staz () {
        int radniStaz = 2023 - godinaZaposlenja;
        return radniStaz;
    }
    public double ukupno (){
        double UkupnaPlata = staz() * 12;
        return UkupnaPlata * plata;
    }
    public void povisica () {
        if (staz()>10) {
            double povisica = plata + ((40/100.00) * plata);
        }

    }
}
