package Task4;

public class DangerousAlbum extends Album {
    // check if a number is prime
    boolean prim(int n) {
        if (n < 2)
            return false;
        if (n % 2 == 0 && n != 2)
            return false;

        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0)
                return false;
        }
        return true;
    }

    @Override
    public void addSong(Song song) {
        if (prim(song.getId()))
            songs.add(song);
    }
}
