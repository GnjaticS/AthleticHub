
public class Main {
    public static void main(String[] args) {
 String Name = "Stefan";
 String Prezime = "Gnjatić";
 int GodinaRođenja = 1991;
 String MestoRođenja = "Zenica";

        System.out.println(Name + " " + Prezime + " " + "je rođen" + " " + GodinaRođenja + ". " + "godine" + " " + "u mestu" + " " + MestoRođenja + ".");

        /* Pomocu konkatenacije spojiti ove tri promenljive u jednu i istampati je sve u
        velikim slovima.*/

        String result = Name.concat(" ").concat(" ").concat(Prezime).concat(" ").concat(" "). concat(MestoRođenja);

        System.out.println(result.toUpperCase() + " " + GodinaRođenja);

        /* Deklarisati i inicijalizovati dve int promenljive.
        Napraviti ispis sa porukom za sledece operacije:
         */
                /*a) a na kvadrat
b) a na kubni
c) ostatak pri deljenju a sa b, ostatak pri deljenju b sa a i njihov zbir
d) izracunati razliku a i b i inkrementovati rezultat za 1.*/

        int a = 5;
        int b = 4;
        int squared = a*a;
        int kubni = kvadrat * a;
        int ostatak1 = a%b;
        int ostatak2 = b%a;
        int zbir = ostatak1 + ostatak2;
        int razlika = a - b;
        razlika ++;

        System.out.println(squared);

    }
}