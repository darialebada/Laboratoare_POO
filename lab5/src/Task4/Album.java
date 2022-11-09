package Task4;

import java.util.ArrayList;

abstract class Album {
    public ArrayList<Song> songs = new ArrayList<Song>();

    abstract void addSong(Song song);

    void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public String toString() {
        return "Album{songs=" + songs + "}";
    }
}
