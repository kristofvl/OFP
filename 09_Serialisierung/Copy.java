import java.io.*;

class Copy {
  public static void copyFile(String from, String to) throws IOException{
    // Ein- und Ausgabedateien öffnen:
    FileInputStream in = new FileInputStream(from);
    FileOutputStream out = new FileOutputStream(to);
    // Datei byteweise kopieren:
    int b;
    while ( (b = in.read()) != -1) {
      out.write(b);
    }
    // Dateien schließen:
    in.close(); out.close();
  }

  // Aufruf: java Copy <Eingabedatei> <Ausgabedatei>
  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Programm benötigt 2 Argumente: " +
                         "<Eingabedatei> <Ausgabedatei>	");
      return;
    }
    try {
      copyFile( args[0], args[1] );
    }
    catch (IOException e) {
      System.err.println("Fehler beim Kopieren: " + e );
    }
  }
}
