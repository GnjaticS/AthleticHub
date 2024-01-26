import java.util.Locale;

public class Zadatak1 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima neki String i vraca broj samoglasnika u tom String-u (a,e,i,o,u).
        String str = "konj";
        System.out.println("broj samoglasnika u stringu je " + samoglasnici(str));
    }
    public static int samoglasnici (String str) {
        str = str.toLowerCase(Locale.ROOT);
        int brojac = 0;
        int [] samoglasnik = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j<samoglasnik.length;j++) {
                if (str.charAt(i) == samoglasnik[j]) {
                    brojac++;
                }
            }
        }
        return brojac;

    }
}
