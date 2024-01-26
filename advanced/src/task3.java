import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        // 4.a)Napraviti metodu koja prima broj i niz brojeva, i vraca taj niz bez tog broja.
        //  b)Napraviti metodu koja prima broj i niz brojeva, i vraca taj niz sa tim brojem.
        int a = 5;
        int [] array = {4, 4, 2, 3, 4};
        System.out.println(Arrays.toString(filterOut(a, array)));
        System.out.println(Arrays.toString(append(a, array)));
    }
    public static int [] filterOut (int a, int [] array) {
        int number = 0;
        for (int i:array) {
            if (i == a) {
                number++;
            }
        }
        int [] newArray = new int[array.length - number];
        for (int i = 0, j = 0; i<newArray.length; i++, j++) {
            while (array[j] == a){
                j++;
            }
            newArray[i] = array[j];
        }
        return newArray;
    }
    public static int [] append (int a, int [] array) {
        var newarray = Arrays.copyOf(array, array.length + 1);
        newarray[newarray.length - 1] = a;
        return  newarray;
    }

}
