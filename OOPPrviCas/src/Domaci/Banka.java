package Domaci;

public class Banka {
    // Kreirati klasu BankovniRacun koja modeluje bankovni račun.
    // Svaki bankovni račun ima svoj jedinstveni broj, ime vlasnika računa, i trenutno stanje na računu.
    // Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju računa.

    // Dodati metode uplata i skidanje koje omogućavaju dodavanje i skidanje novca sa računa.
    // Obe metode treba primiti iznos kao argument. Metoda uplata treba povećati trenutno stanje računa za dati iznos,
    // dok metoda skidanje treba smanjiti trenutno stanje računa.
    // Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno sredstava na računu za
    // skidanje.

    int JBB;
    String ImeVlasnika;
    int stanjeNaRacunu;


    public Banka (int a, String str, int b) {
        this.JBB = a;
        this.ImeVlasnika = str;
        this.stanjeNaRacunu = b;

    }
    public void uplata (int a){
        int povecanje = 0;
        if (a > 0 && stanjeNaRacunu > 0) {
            povecanje = stanjeNaRacunu + a;
            System.out.println("Stanje na računu nakon povećanja je: " + povecanje);
        }

    }
    public void smanjenje (int a) {
        int smanjenje = 0;
        if (a>0 && stanjeNaRacunu > a) {
            smanjenje = stanjeNaRacunu - a;
            System.out.println("Stanje na računu nakon smanjenja je: " + smanjenje);
        } else {
            System.out.println("Korisnik je u nedozvoljenom minusu! ");
        }

    }
    public String toString () {
        return "Stanje na računu korisnika " + ImeVlasnika + " " + "sa jedinstvenim bankovnim brojem " + JBB + " je: " + stanjeNaRacunu;
    }

}
