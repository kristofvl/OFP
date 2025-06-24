/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album {
  private Song[] lieder; // aray von Lieder
  public Album(int size) {  // erstelle ein Array von Songs
    lieder = new Song[size];
  }
  public void setSong(int songIndex, String t ,String a) {
    // hier könnte man noch songIndex überprüfen (siehe Zeile 29)
    lieder[songIndex] = new Song(t,a);
  }
}