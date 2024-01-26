import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        // Napraviti listu sa 20 parnih brojeva, izracunati sumu elemenata liste.

        ArrayList <Integer> listaParnih = new ArrayList<>();
        int count = 0;

        for (int i = 0; i<42; i+= 2) {
            listaParnih.add(i);
            count+= i;

        }
        System.out.println(count);
        for (int i=0; i<listaParnih.size(); i++){
            if (listaParnih.get(i)%4==0)
                listaParnih.remove(i);
        }
        System.out.println(listaParnih);

        }

        // Iz date liste izbaciti sve elemente deljive sa 4



}
