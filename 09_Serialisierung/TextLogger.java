import java.io.*;
class TextLogger {
  public static void main(String[] args) {
    // IOException soll in main gefangen werden:
    try {
      FileOutputStream out = new FileOutputStream("log.txt");  // Ausgabe
      // Zeichen einlesen bis Stromende (Strng-D), schreibe jedes Zeichen
      // via out in die Ausgabedatei:
      int b;
      while ( ( b = System.in.read() ) != -1 ) {
        out.write(b);
      }
      // Datei schließen:
      out.close();
    }
    catch ( IOException e ) {
       System.out.println("Fehler: "+e);
    }
  }
}
