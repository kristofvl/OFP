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
        MusicLib lib = new MusicLib(300);
        lib.setAlbum(0);  // erstelle ein Album auf index 0
        lib.setSong(0, 0, "Mein Titel", "Artist");  // erstelle Lied auf Album 0, Lied 0
    }
}