public class Zadatak1 {
    public static void main(String[] args) {
        // Napraviti metodu koja kao argument prima niz celih brojeva i stampa
        //sve brojeve koji su deljivi sa 3 i sa 4.
        int [] niz = {2, 3, 4, 12, 24, 16, 36};
        deljiviBrojevi(niz);

    }
    public static void deljiviBrojevi (int [] niz) {
        for (int pivot: niz) {
            if (pivot%3 == 0 && pivot % 4 == 0){
                System.out.println(pivot);
            }
        }
    }



    }
