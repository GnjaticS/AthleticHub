public class Zadatak5 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima dva niza Stringova, racuna duzinu
        //drugog najduzeg String-a iz prvog niza i duzinu drugog najduzeg
        //String-a iz drugog niza, kao rezultat vraca njihov zbir.
        String [] str = {"Stefan", "Igor", "Anastasija"};
        String [] text = {"Bogoljub", "Bojan", "Sara"};
        System.out.println("Zbir drugog najdužeg stringa iz prvog niza stringova i drugog najdužeg stringa iz drugog niza stringova je: " + zbirDrugugNajdužeg(str, text));
    }
    public static int zbirDrugugNajdužeg (String [] str, String [] text) {
        int zbir = drugiNajduzi(str) + drugiNajduzi(text);
        return zbir;

    }
    public static int drugiNajduzi (String [] str) {
        int najduzi = Integer.MIN_VALUE;

        for (String pivot: str) {
            if (pivot.length()>najduzi) {
                najduzi = pivot.length();
            }
        }
        int drugiNajduzi = Integer.MIN_VALUE;
        for (String pivot: str) {
            if (pivot.length()<najduzi && pivot.length()>drugiNajduzi){
                drugiNajduzi = pivot.length();
            }
        }
        return drugiNajduzi;
    }
}
