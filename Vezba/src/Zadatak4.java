import java.util.Locale;

public class Zadatak4 {
    public static void main(String[] args) {
        // Napisati metodu koja prima niz
        // stringova i ispisuje sve stringove koje sadrze bar jedno malo i bar jedno veliko slovo.
        String[] text = {"Nemanja", "goran", "PREDRAG", "zORICA"};
        velikaSlova(text);
    }
    public static void velikaSlova (String [] text) {
        for (String pivot:text) {
            if (pivot.equals(pivot.toLowerCase()) || pivot.equals(pivot.toUpperCase())){
                continue;
            } else {
                System.out.println(pivot);
            }
        }
    }
}
