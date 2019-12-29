package section8.arrays_lists_autoboxing.PlaylistApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main_PlaylistApp {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("GO home", 4.2);
        album.addSong("Eat", 4.1);
        album.addSong("Box", 4.4);
        album.addSong("Play", 4.7);
        album.addSong("Meat", 3.6);
        albums.add(album);

        album = new Album("Love for you", "AC/DC");  //we created a new object here so different than prev album
        album.addSong("Storm", 4.6);
        album.addSong("GO home now", 4.2);
        album.addSong("Eaty", 4.1);
        album.addSong("Boxy", 4.4);
        album.addSong("Pla", 4.7);
        album.addSong("Meet me", 3.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song> ();
        albums.get(0).addToPlayList("Play", playList);
        albums.get(0).addToPlayList("Eat", playList);
        albums.get(0).addToPlayList("Play me right", playList);
        albums.get(0).addToPlayList(8, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(14, playList);


        play(playList);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0) {
            System.out.println("No such song in playlist");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());   // .next accesses the first item
        }

        while(!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

            }
        }
    }
}
