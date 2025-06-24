/**
 * Write a description of class MusicLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLib {
  private Album[] alben;  // array von Musikalben
  private int size;
  public MusicLib(int size) {  // erstelle ein Array von Albums
    this.size = size;
    alben = new Album[size];
  }
  public void setAlbum(int index) {  // erstelle ein Album auf index
    if ( (index >= 0) && (index < size) )  // liegt index in [0,300[?
      if (alben[index] == null)  // besteht dieses Album noch nicht?
        alben[index] = new Album(15);
      else
        System.out.println("Fehler: Album["+index+"] besteht schon.");
  }
  public void setSong(int albumIndex, int songIndex, String t ,String a) {
    alben[albumIndex].setSong(0, t, a);
  }
}