package org.northcoders;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();
      // int a = 0;
        List<Song> songs = new ArrayList<>(List.of(
                new Song("Bohemian Rhapsody", "Queen", 354),
                new Song("Imagine", "John Lennon", 183),
                new Song("like a Rolling Stone", "Bob Dylan", 366),
                new Song("billie Jean", "Michael Jackson", 294),
                new Song("mukkala Mukkabula", "A R Rahman", 234)

        ));

        playlist.addSongs(songs);

        playlist.addSong(new Song("Impossible Soul", "Sufjan Stevens", 1748));
        playlist.addSong(new Song("The Wheels On The Bus", "King Henry VIII", 30));

        playlist.play();

        playlist.shuffle();

        playlist.play();
    }
}