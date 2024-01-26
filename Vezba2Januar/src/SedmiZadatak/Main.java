package SedmiZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pesma song1 = new Pesma(373, "Pored mene");
        Pesma song2 = new Pesma(3482, "Zajedno");
        Pesma song3 = new Pesma(234, "Hladan");
        Pesma song4 = new Pesma(73, "Zemlja");

        ArrayList<Pesma> listaPesama = new ArrayList<>();
        listaPesama.add(song1);
        listaPesama.add(song2);
        listaPesama.add(song3);
        listaPesama.add(song4);

        Album dumdum = new Album("Dumdum", listaPesama);
        dumdum.najvećiHit();
        System.out.println("Pesma sa najviše pregleda je: " + dumdum.najvećiHit());

        Pesma song5 = new Pesma(124, "Ljubav");
        Pesma song6 = new Pesma(732, "Krug");
        Pesma song7 = new Pesma(342, "Srce");
        Pesma song8 = new Pesma(346, "Jadransko more");

        ArrayList<Pesma> listaPesama2 = new ArrayList<>();
        listaPesama2.add(song5);
        listaPesama2.add(song6);
        listaPesama2.add(song7);
        listaPesama2.add(song8);

        Album ljubav = new Album("Ljubav", listaPesama2);
        System.out.println(ljubav.najvećiHit());

        ArrayList<Album> listaAlbuma = new ArrayList<>();
        listaAlbuma.add(dumdum);
        listaAlbuma.add(ljubav);

        Muzičar MilanM = new Muzičar(listaAlbuma);
        System.out.println(MilanM.ukupnoPregleda());

        Muzičar Baki = new Muzičar(listaAlbuma);

        Muzičar neki = new RokZvezda(listaAlbuma);
        neki.zarada();

        Muzičar nekiNarodnjak = new KafanskiPevač(listaAlbuma);
        nekiNarodnjak.zarada();

    }
}
