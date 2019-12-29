package section8.arrays_lists_autoboxing.PlaylistApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title,duration));
        }
    }
}
