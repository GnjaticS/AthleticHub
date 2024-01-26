package DrugiZadatak;

public class Valuta {
    private String name;
    private String symbol;
    private double kurs;

    public Valuta(String name, String symbol, double kurs) {
        this.name = name;
        this.symbol = symbol;
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Valuta{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", kurs=" + kurs +
                '}';
    }

    // Metoda: konvertujUdinare(iznos: number), koja konvertuje zadati iznos u dinare koristeći trenutni kurs valute.

    public double convertsDinar (double amount) {

        return amount * kurs;
    }

}
