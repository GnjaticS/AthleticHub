public class Zadatak4 {
    public static void main(String[] args) {
        // Napraviti metodu koja prima niz karaktera od x i o, zatim prolazi kroz
        //taj niz i trazi tri uzastopna karaktera (x ili o). Cim naidje tri puta za
        //redom na jedan karakter, izlazi iz metode i stampa poruku koji
        //karakter je pobedio (koji se pronasao tri puta uzastopno)
        char [] game = {'x', 'o', 'o', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'o', 'o'};
        igrica(game);

    }
    public static void igrica (char [] game) {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i<game.length; i++) {
            if (game[i] == 'x' && game[i+1] == 'x' && game[i+2] == 'x'){
                System.out.println("Pobednik je x! ");
                break;
            }
            else if (game[i] == 'o' && game[i+1] == 'o' && game[i+2] == 'o') {
                System.out.println("Pobednik je o! ");
                break;
            }

        }
    }
}
