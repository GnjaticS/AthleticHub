public class Zadatak2 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima niz Stringova i jedan String,
        // kao rezultat vraca da li se on nalazi tu ili ne (true ili false).
        String [] neki = {"Stefan", "Boris", "Ana"};
        String nekiDrugi = "bori";
        System.out.println(nalazenje(neki, nekiDrugi));
    }
    public static boolean nalazenje (String [] str, String niz) {
        for (String pivot:str) {
            if (pivot.equalsIgnoreCase(niz)){
                return true;
            }
        }
        return false;
    }
}
