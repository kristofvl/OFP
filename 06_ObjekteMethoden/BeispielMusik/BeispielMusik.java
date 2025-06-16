/**
 * Write a description of class BeispielMusik here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BeispielMusik {
      public static void main(String[] args) {
    // Erzeuge eine MusicLibrary mit 300 Alben; das erste Album soll 15 Songs haben.
    // Gebe dem ersten Song einen Title und Artist.
    MusicLib m = new MusicLib(300);
    m.setAlbum(0, 15);
    m.setAlbumSong(0, 0, "Einen Title", "Artist");
  }
}