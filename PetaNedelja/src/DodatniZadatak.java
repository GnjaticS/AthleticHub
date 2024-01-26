public class DodatniZadatak {

    // 4. Napisati metodu koja prima 2 niza celih brojeva, iterira kroz oba niza, zatim
    //1) za sve elemente iz prvog niza cija je vrednost manja od 3, menja tu vrednost na 0

    public static int [] drugacijiNiz (int [] a, int [] b) {
        int brojač = 0;
        for (int pivot:a) {
            if (pivot<3) {
                a[brojač] = 0;
                brojač++;
            } else {
                brojač++;
            }
        }
        for (int upitnik:b) {
            continue;
        }
        return a;

    }

    public static void main(String[] args) {
        int [] a = {2, 4, 1, 8};
        int [] b = {2, 1, 4, 9};
        System.out.println(drugacijiNiz(a, b));
    }
}
