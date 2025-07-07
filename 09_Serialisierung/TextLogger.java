/**
 * TextLogger – Einfache Java-Anwendung zum Einlesen von Zeichen über die Tastatur
 * und zum Mitschreiben dieser Zeichen in eine Textdatei ("log.txt"). Dieses
 * Programm liest zeichenweise Benutzereingaben von der Standard-Eingabe (System.in)
 * und schreibt alle empfangenen Zeichen in die Datei "log.txt".
 *
 * Man kann beliebige Zeichen eingeben, die direkt in die Datei geschrieben werden.
 * Das Programm läuft, bis das Ende der Eingabe (STRG+D / STRG+Z je nach System).
 * Die Datei wird mit `FileOutputStream` geöffnet, Zeichen werden binär geschrieben.
 *
 * Anwendung:
 * >java TextLogger
 * (danach beliebige Zeichen eingeben – sie werden nach "log.txt" geschrieben)
 */

import java.io.*;
class TextLogger {
  public static void main(String[] args) {
    // TODO: IOException abfangen – try-catch-Block verwenden

      // TODO: FileOutputStream erstellen für Datei "log.txt"
      FileOutputStream out = /* ... */;

      // TODO: Zeichen einlesen, bis Ende der Eingabe (System.in.read() == -1)
      int b;
      while ( /* TODO: passende Bedingung einsetzen */ ) {
        // TODO: Zeichen in die Ausgabedatei schreiben (mit .write() ))
        /* ... */
      }

      // TODO: Ausgabestrom schließen (mit .close())
      /* ... */

      // TODO: Fehlermeldung ausgeben mit System.out.println()

  }
}
