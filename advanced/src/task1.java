import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        // 2. Bingo!
        //a)Napraviti metodu koja kreira nase brojeve za bingo kao niz od 4 nasumicna broja.
        //b)Napraviti metodu koja kreira brojeve koji se izvlace kao niz od 20 nasumicnih brojeva.
        //c)Napraviti metodu koja proverava koliko se nasih brojeva pojavljuje u izvlacenju.
        Random gen = new Random();

        int [] ourNumbers = new int[4];
        fillBingo(ourNumbers);
        System.out.println(Arrays.toString(ourNumbers));
        System.out.println("break");
        int [] extractedNumbers = new int[20];
        fillBingo(extractedNumbers);
        System.out.println(Arrays.toString(extractedNumbers));
        System.out.println("break");
        System.out.println(check(ourNumbers, extractedNumbers));

    }
    public static void fillBingo (int [] array) {
        Random gen = new Random();
        for (int i = 0; i<array.length; i++) {
            array[i] = gen.nextInt(99);
        }
    }
    public static int check (int [] ourNumbers, int [] extractedNumbers) {
        int count = 0;
        for (int extracted : extractedNumbers) {
            for (int ours : ourNumbers) {
                if (extracted == ours) {
                    count++;
                }
            }
        }
        return count;
    }
}
