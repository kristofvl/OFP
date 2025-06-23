class Song {
  private String title, artist;
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
    System.out.println("Lied: "+title+" by "+artist);
  }
}

class Album {
  private Song[] lieder; // aray von Lieder
  public Album(int size) {  // erstelle ein Array von Songs
    lieder = new Song[size];
  }
  public void setSong(int songIndex, String t ,String a) {
    // hier könnte man noch songIndex überprüfen (siehe Zeile 29)
    lieder[songIndex] = new Song(t,a);
  }
}

class MusicLib {  // Music library
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

class BeispielMusik_Loesung {
  public static void main(String[] args) {
    // Erzeuge eine MusicLibrary mit 300 Alben; das erste Album soll 15 Songs haben.
    // Gebe dem ersten Song einen Title und Artist.
    MusicLib lib = new MusicLib(300);
    lib.setAlbum(0);  // erstelle ein Album auf index 0
    lib.setSong(0, 0, "Mein Titel", "Artist");  // erstelle Lied auf Album 0, Lied 0
  }
}
