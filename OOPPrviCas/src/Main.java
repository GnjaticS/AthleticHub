
public class Main {
    public static void main(String[] args) {
        // Napraviti klasu Prodavac koja ima ime, prezime i godinu zaposlenja,
        // takodje ima metod koji vraca radni staz prodavca. Istampati podatke u prodavcu.
        Prodavac Stefan = new Prodavac("Stefan", "Gnjatic", 2000);
        System.out.println(Stefan);
        System.out.println(Stefan.godinaZaposlenja + " " + Stefan.radniStaz());



    }

}