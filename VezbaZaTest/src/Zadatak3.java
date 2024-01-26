import java.util.Arrays;

public class Zadatak3 {
    public static void main(String[] args) {
        // Inicijalizovati dva niza stringova. Zatim napisati metodu koja ce kreirati
        // novi niz koji ce sadrzati stringove iz oba niza koji su napisani velikim slovima.
        String [] niz1 = {"Stefan", "Boris", "Ana"};
        String [] niz2 = {"Predrag", "Rajka"};
        System.out.println(Arrays.toString(noviNiz(niz1, niz2)));
    }
    public static String [] noviNiz (String [] niz1, String [] niz2) {
        int count = niz2.length + niz1.length;
        int index = 0;
        String [] niz3 = new String[count];
        for (String pivot: niz1) {
            niz3[index] = pivot.toUpperCase();
            index++;
        }
        for (String pivot: niz2) {
            niz3[index] = pivot.toUpperCase();
            index++;
        }
        return niz3;
    }
}
