public class Zadatak5 {
    //Napraviti metodu koja prima niz Stringova i jedan String,
    // kao rezultat vraca da li se on nalazi tu ili ne (true ili false).

    public static boolean postojanjeStringa (String[] a, String b){

        for (int i = 0; i<a.length; i++) {
            if (a[i].equalsIgnoreCase(b)) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String [] a = {"Marko", "Dejan", "Tamara", "Goran", "Violeta"};
        String b = "Tamara";
        System.out.println(postojanjeStringa(a, b));

    }
}
