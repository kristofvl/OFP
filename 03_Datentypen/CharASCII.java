/**
  ASCII-Tabelle: Kodierung für Zeichensätze
  https://de.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange
  */

class CharASCII {
  public static void main( String[] str ) {
    char symbol;  // Variable für Zeichen
    symbol = '@';
    System.out.print( "Die ASCII-Kodierung für [" + symbol + "] ist " );
    System.out.println( (int) symbol );  // Methode zum Drucken auf die Konsole
  }
}
