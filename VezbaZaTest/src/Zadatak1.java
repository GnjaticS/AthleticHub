import java.util.Arrays;

public class Zadatak1 {
    public static void main(String[] args) {
        //  Napisati metodu koja za
        //  prosledjeni niz stringova kreira nov niz koji sadrzi samo stringove cija je duzina veca od 3
        String[] tekst = {"Boris", "Ana", "bo", "Stefan"};
        System.out.println(Arrays.toString(duzinaVecaod3(tekst)));
    }

    public static String[] duzinaVecaod3(String[] str) {
        int count = 0;

        for (String pivot : str) {
            if (pivot.length() > 3) {
                count++;
            }
        }
        String[] noviNiz = new String[count];
        int index = 0;
        for (String pivot : str) {
            if (pivot.length() > 3) {
               noviNiz[index] = pivot;
               index++;
                }

            }

        return noviNiz;
    }
}
