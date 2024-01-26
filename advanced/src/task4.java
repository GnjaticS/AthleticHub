import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima niz brojeva i vraca niz tih brojeva u obrnutom redosledu
        int [] array = {3, 4, 5, 2};
        System.out.println(Arrays.toString(reversed(array)));
    }
    public static int []  reversed (int [] array) {
        int [] newone = new int[array.length];

        int last_i = array.length - 1;
        
        for (int i = 0; i<array.length; i++, last_i--) {
            newone[last_i] = array[i];
        }
        return newone;
    }
}
