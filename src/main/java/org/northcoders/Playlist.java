package org.northcoders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addSongs(List<Song> songs) {
        songs.addAll(songs);
    }

    public void shuffle() {
        Collections.shuffle(songs);
    }

    public void play() {
        for (int i = 0; i <= songs.size(); i++) {
            System.out.println("Playing: " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
        }
    }


}
