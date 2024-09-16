package Task4;

public class BadAlbum extends Album {
    // check if a number is palindrome
   boolean palindrom(int n) {
        int copy = n;
        int pd = 0;
        while (copy > 0) {
            pd = pd * 10 + copy % 10;
            copy /= 10;
        }
        if (pd == n)
            return true;
        return false;
    }

    @Override
    public void addSong(Song song) {
        if (palindrom(song.getId()) && song.getName().length() == 3)
            songs.add(song);
    }
}
