public class Zadatak13 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima ceo broj, racuna njegov kvadrat, pa ga zatim deli sa dva i vraca rezultat.
        int broj = 6;
        System.out.println(ceoBroj(broj));
    }
    public static int ceoBroj (int broj) {
        int rezultat = (broj * broj)/2;
        return rezultat;

    }
}
