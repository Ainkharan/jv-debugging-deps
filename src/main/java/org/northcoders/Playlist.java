package org.northcoders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void addSongs(List<Song> songs) {
        this.songs.addAll(songs);
    }

    public void shuffle() {
        System.out.println(System.lineSeparator());
        System.out.println("*** SHUFFLING playlist ***");
        Collections.shuffle(this.songs);
    }

    public void play() {
        System.out.println(System.lineSeparator());
        System.out.println("*** PLAYING playlist ***");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Song " + (i + 1) + ": " + StringUtils.capitalize(songs.get(i).getTitle()) + " by " + songs.get(i).getArtist());
        }
    }


}
