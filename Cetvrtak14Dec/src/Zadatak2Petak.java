public class Zadatak2Petak {
    public static void main(String[] args) {
        // Napraviti metodu koja prima String i karakter, i vraca broj pojavljivanja
        //tog karaktera u Stringu.
        String ime = "Stefan";
        char slovo = 'a';
        int brojPonavljanja = brojPonavljanja(ime, slovo);
        System.out.println(brojPonavljanja);


    }
    public static int brojPonavljanja (String a, char b) {
        int count = 0;
            for (int i = 0; i<a.length(); i++) {
                if (a.charAt(i) == b) {
                 count ++;
            }
        }
        return count;
    }

}
