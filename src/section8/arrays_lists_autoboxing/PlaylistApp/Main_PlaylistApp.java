package section8.arrays_lists_autoboxing.PlaylistApp;

import java.lang.reflect.Array;
import java.util.*;

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
            printMenu();
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
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printList(playList);
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit \n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay current song\n" +
                    "4 - list songs in playlist\n" +
                    "5 - print available actions\n" +
                    "6 - delete current song from playlist.");
        System.out.println("\n");
    }

    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================================");
    }

}
