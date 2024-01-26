package Zadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Video 1", 1500, 200);
        Video video2 = new Video("Video 2", 1200, 150);
        Video video3 = new Video("Video 3", 2000, 300);

        // Pravljenje primera kanala
        ArrayList<Video> listaVidea1 = new ArrayList<>();
        listaVidea1.add(video1);
        listaVidea1.add(video2);
        listaVidea1.add(video3);

        YouTubeKanal kanal1 = new YouTubeKanal(5000, listaVidea1);

        ArrayList<Video> listaVidea2 = new ArrayList<>();
        listaVidea2.add(video3);

        ArrayList<Video> listaVidea3 = new ArrayList<>();
        listaVidea3.add(video1);
        listaVidea3.add(video2);
        listaVidea3.add(video3);

        GejmingKanal gejmingKanal = new GejmingKanal(80, listaVidea2);
        BBPodcast podcast = new BBPodcast(1500, listaVidea3);


        // Pravljenje instance YouTube
        ArrayList<YouTubeKanal> listaKanala = new ArrayList<>();
        listaKanala.add(kanal1);
        listaKanala.add(gejmingKanal);
        listaKanala.add(podcast);

        YouTube youtube = new YouTube(listaKanala);

        // Testiranje metoda
        System.out.println("Najpopuarniji video: " + kanal1.najpopularnijiVideo());
        System.out.println("Ukupan broj lajkova: " + kanal1.ukupnoSviđanja());
        System.out.println("Zarada kanala: $" + kanal1.zarada());


        System.out.println("Najprofitabilniji kanal: " + youtube.najprofitabilniji().getClass().getSimpleName());


        System.out.println(podcast.zarada());

        youtube.izbaciKanal();
        System.out.println("Nakon izbacivanja gejming kanala sa manje od 100 pretplatnika: " + youtube.getListaKanala().size() + " kanala");

        System.out.println("Pretraga kanala po imenu: " + youtube.search("Video 1"));

        // Sortiranje kanala po broju pretplatnika
        youtube.sortirajKanale();
        System.out.println("Sortirani kanali po broju pretplatnika:");
        for (YouTubeKanal kanal : youtube.getListaKanala()) {
            System.out.println(kanal.getClass().getSimpleName() + " - " + kanal.getBrPretplatnika() + " pretplatnika");
        }


    }
}
