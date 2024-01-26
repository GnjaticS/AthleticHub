import java.util.Scanner;

public class Zadatak2 {
    // Napraviti metodu koja prima dva Stringa, i vraca nam poruku koji je od ta dva String duzi.
    public static String poređenje (String a, String b) {
        String poruka = "prvi string je duži";
        String poruka2 = "drugi string je duži";
        if (a.length() < b.length()) {
            return poruka;
        } else if (b.length() < a.length()) {
            return poruka2;
        }
        return poruka;
    };


    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi prvi string: ");
        String a = skener.next();
        System.out.println("Unesi drugi string: ");
        String b = skener.next();
        System.out.println(poređenje(a, b));
    }
}
