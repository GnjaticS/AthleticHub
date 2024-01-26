public class Zadatak11 {
    public static void main(String[] args) {
        //Napraviti metodu koja prima String i vraca broj pojavljivanje tacke(.) i uzvicnika (!).
        String str = "sfsd!!skdng..1!";
        System.out.println("Broj ponavljanja ! i . je " + uzvičnik(str));
    }
    public static int uzvičnik (String str){
        int count = 0;
        for (int i=0; i<str.length();i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == '.') {
                count++;
            }
        }
        return count;
    }
}
