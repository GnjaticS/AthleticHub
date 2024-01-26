package DodatniZadatak;

public class Main {
    public static void main(String[] args) {
        // Napraviti klasu Operacija koja kao atribut prima a i b,
        // takodje ima metode za sabiranje, oduzimanje, mnozenje i deljenje. Istampati podatke o klasi.
        Operacija računanje = new Operacija(5, 7);
        System.out.println(računanje);
        Operacija računanje2 = new Operacija(9, 8);
        System.out.println(računanje2);
        Operacija računanje3 = new Operacija(6, 4);
        System.out.println(računanje3);


    }
}
