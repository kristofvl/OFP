/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song {
  private String title, artist;
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
    System.out.println("Lied: "+title+" by "+artist);
  }
}