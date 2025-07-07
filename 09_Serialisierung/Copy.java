/**
 * Copy – Ein einfaches Java-Programm zum Kopieren von Dateien.
 * Dieses Programm liest den Inhalt einer Quelldatei (Dateiname: <from>)
 * und schreibt ihn byteweise in eine Zieldatei (Dateiname: <to>).
 * Es kann zum Beispiel zum Kopieren von Text- oder Binärdateien verwendet werden.
 *
 * Anwendung:
 * > java Copy quelle.txt ziel.txt
 *
 * Die Methode `copyFile(String from, String to)` öffnet die Eingabe- und Ausgabedateien
 * mit FileInputStream bzw. FileOutputStream. Dann werden die Daten Byte für Byte
 * ausgelesen und in die Zieldatei geschrieben. Die Streams werden nach dem Kopiervorgang
 * sauber geschlossen.
 * Das Programm überschreibt die Zieldatei, falls sie bereits existiert.
 */

import java.io.*;

class Copy {
  public static void copyFile(String from, String to) throws IOException {
    // TODO: Eingabestrom (FileInputStream) für Datei 'from' öffnen
    FileInputStream in = /* ... */;

    // TODO: Ausgabestrom (FileOutputStream) für Datei 'to' öffnen
    FileOutputStream out = /* ... */;

    // TODO: Datei Byte für Byte kopieren – mit Schleife einlesen (mit .read())
    // und schreiben (mit .write())
    int b;
    while ( /* TODO: Bedingung für Einlesen bis -1 */ ) {
      // TODO: Byte 'b' in Ausgabestrom schreiben
    }

    // TODO: Ein- und Ausgabestrom schließen (mit .close())
    /* ... */
  }

  // Aufruf: java Copy <Eingabedatei> <Ausgabedatei>
  public static void main(String[] args) {
    // TODO: Prüfen, ob genau zwei Argumente übergeben wurden
    if (/* ... */) {
      System.err.println("Programm benötigt 2 Argumente: <Eingabedatei> <Ausgabedatei>");
      return;
    }

    try {
      // TODO: Methode copyFile mit den übergebenen Argumenten aufrufen
      /* ... */
    } catch (IOException e) {
      // TODO: Fehlermeldung ausgeben mit System.err.println()
    }
  }
}
