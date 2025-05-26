/**
  Implementiere ein Java-Programm, das ein Dreieck mit einer bestimmten Breite
  und Höhe „size“ zeichnet. Diese Variable wird als Kommandozeilenargument aus
  dem Terminal gelesen (siehe unten).

  Für "java Schleife06.java 4" zum Beispiel ist die Ausgabe:
   X
   XX
   XXX
   XXXX

  Benutze System.out.print() und System.out.println() für die Ausgabe.
  */

class Schleife06 {
  public static void main( String[] str ) {
    int size = Integer.parseInt(str[0]);  // size = 1. Argument

    for (int x = 1; x <= size; x++) {
       for (int y = 0; y < x; y++) {
         System.out.print('X');
       }
       System.out.println();
    }
  }
}
