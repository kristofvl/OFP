/**
  Die Integer-Variable kann auch anders dargestellt werden, zum Beispiel
  als eine Reihe von Bits.
  Binär zu Dezimal, https://docs.oracle.com/javase/8/docs/technotes/
  guides/language/binary-literals.html
  */

class Bits {
  public static void main( String[] str ) {
    int y;  // Variable für Integer
    y = 0b01010101;  // Bitfolge 01010101
    // Diese Anweisungen geben den Wert der Variablen y auf der Konsole aus:
    System.out.print( "Binärzahl zu dezimal: " );
    System.out.println( y );    }
}
