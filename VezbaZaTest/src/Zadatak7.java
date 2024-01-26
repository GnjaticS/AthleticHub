import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        // Napisati program koji koristi metodu da
        // proveri da li se sa unetim duzinama stranica moze konstruisati trougao.
        Scanner skener = new Scanner(System.in);
        System.out.println("unesi dužinu prve stranice: ");
        int a = skener.nextInt();
        System.out.println("Unesi dužinu druge stranice: ");
        int b = skener.nextInt();
        System.out.println("Unesi dužinu treže stranice: ");
        int c = skener.nextInt();
        if (trougao(a,b,c)) {
            System.out.println("Od datih stranica može se kreirati trougao.");
        } else {
            System.out.println("Od datih stranica ne može se kreirati trougao");
        }
    }
    public static boolean trougao (int a, int b, int c){
        if ((a+b) > c && (a+c) > b && (b+c) > a){
            return true;
        }
        return false;
    }
}
