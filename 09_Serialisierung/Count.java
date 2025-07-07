/**
 * Count – Ein einfaches Java-Programm zur Zählung von Bytes der Standardeingabe.
 * Dieses Programm liest alle Zeichen (Bytes) von der Standardeingabe (`System.in`)
 * bis zum Dateiende (EOF) ein und zählt dabei, wie viele Bytes gelesen wurden.
 *
 * Ein Byte wird mit `System.in.read()` als Integer eingelesen. Solange der
 * Rückgabewert nicht -1 ist (was das Ende der Eingabe signalisiert), wird ein
 * Zähler inkrementiert. Nach dem Einlesen wird die Gesamtanzahl der eingelesenen
 * Bytes auf System.out ausgegeben – als String, codiert als Byte-Array.
 *
 * Das Ende der Eingabe kann über `Strg+D` (Linux/Mac) oder `Strg+Z` (Windows)
 * signalisiert werden.
 *
 * Beispiel:
 * > java Count
 * (Eingabe tippen, dann EOF senden)
 * Ausgabe: Eingabe hatte 15 Bytes
 */


import java.io.*;

public class Count {
  // IOException wird nicht abgefangen, sie muss deklariert werden:
  public static void main(String[] args) throws IOException {
    int count = 0;
    int c;

    // Implementieree eine Schleife, die Zeichen von System.in liest
    // Hinweis: Verwende System.in.read() zum Einlesen eines Zeichens
    // Die Schleife soll laufen, bis -1 (EOF) gelesen wird
    do {
      // TODO: Einlesen eines Zeichens und Zuweisung an Variable 'c'

      // TODO: Wenn 'c' nicht -1 ist, Zähler erhöhen

    } while (/* TODO: passende Bedingung einsetzen */);

    // TODO: Nachricht erzeugen, z. B.: "Eingabe hatte X Bytes"
    String msg = /* ... */;

    // TODO: Nachricht als Byte-Array über System.out.write(...) ausgeben
    // mit der String Methode getBytes()

  }
}
