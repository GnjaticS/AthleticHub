import java.util.Locale;

public class Zadatak9 {
    public static void main(String[] args) {
        // Napisati program koji koristi metodu da proveri da li je uneti
        // string palindrom cita se isto unapred i unazad).
        String str = "Ana voli milovana";
        System.out.println(palindrom(str));
    }
    public static boolean palindrom (String str) {
        str = str.toLowerCase(Locale.ROOT);
        String novi = "";
        int duzina = str.length();
        int index = 0;
        for (int i=duzina-1; i>=0; i--) {
            novi += str.charAt(i);

        }
        if (novi.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
