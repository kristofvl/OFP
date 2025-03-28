class TypUebung {
  public static void main( String[] s) {
    /* Deklarieren und initialisieren Sie die folgenden Variablen und geben Sie sie in der Konsole aus: */

    /* Variable zur Speicherung der Weltbevölkerung: */

    double welt = 7000000000.0;
    
    /* Variable zur Speicherung der Bevölkerungszahl eines Landes, gerundet in Millionen : */
    short indien = (short)1500;
    
    /* Variable zur Speicherung des prozentualen Anteils der Bevölkerung eines Landes an der Weltbevölkerung: */
    float prozentIndien = (float) ( 100.0 * (indien*1000000.0)/welt );
    System.out.println("Prozent von Indien: " + prozentIndien);
    
    /* Variable, die speichert, ob die Bevölkerung eines Landes mehr als 1 % der Weltbevölkerung ausmacht: */
    boolean einProzent = (prozentIndien > 1.0f);
    
    /* Variablen zum Speichern dieses Symbols: ☺ */
    char mensch = '☺';
    
    /* Konstanten zum Speichern des Flaggensymbols eines Landes, z.B. 🇧🇪 : */
    char c1 = 0xF234, c2 = 0xA365;

    /* Konstante zum Speichern des Namens eines Landes, z.B. Belgien */
    System.out.println( "Belgien" );
  }
}
