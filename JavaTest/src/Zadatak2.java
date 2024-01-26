public class Zadatak2 {
    public static void main(String[] args) {
        //Napraviti metodu koja prima niz String-ova i jos jedan String, vraca
        //broj pojavljivanje tog String-a u nizu.
        String [] str = {"Marko", "Dejan", "Violeta", "Tamara", "Marko", "Marko"};
        String text = "Marko";
        System.out.println("Broj ponavljanja datog stringa unutar niza stringova je: " + brojPonavljanja(str, text));
    }
    public static int brojPonavljanja (String [] str, String text) {
        int count = 0;
        for (String pivot: str) {
            if (pivot.equalsIgnoreCase(text)){
                count++;
            }
        }
        return count;
    }
}
