package org.northcoders;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        List<Song> songs = new ArrayList<>(List.of(
                new Song("Bohemian Rhapsody", "Queen", 354),
                new Song("Imagine", "John Lennon", 183),
                new Song("Like a Rolling Stone", "Bob Dylan", 366),
                new Song("Billie Jean", "Michael Jackson", 294)
        ));

        playlist.addSongs(songs);

        playlist.addSong(new Song("Impossible Soul", "Sufjan Stevens", 1748));
        playlist.addSong(new Song("The Wheels On The Bus", "King Henry VIII", 30));

    }
}