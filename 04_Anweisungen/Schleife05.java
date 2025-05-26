/**
  Implementiere ein Java-Programm, das eine zufällige Anzahl von 'X' Zeichen
  ausgibt. Verwende die Methode Math.random(), die eine Fließkommazahl
  zwischen 0 und 1 zurückgibt, und höre auf, „X“ zu drucken, wenn sie eine Zahl
  kleiner als 0,09 zurückgibt. Verwende *keine* Variablen.

  Benutze System.out.print() und System.out.println() für die Ausgabe.
  */

class Schleife05 {
  public static void main( String[] str ) {
    do {
      System.out.print( 'X' );
    } while (Math.random()>0.09);
    System.out.println();
  }
}
