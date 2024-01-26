public class task2 {
    public static void main(String[] args) {
        // 3.Napraviti metodu koja prihvata niz Stringova i vraca najduzi String iz niza.
        String [] names = {"stefan", "Egor", "Damir"};
        System.out.println("The longest string in an array is " + theLongest(names));
    }
    public static String theLongest (String [] strArray) {
        String longest = strArray[0];
        for (String str: strArray) {
            if (str.length()>longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
