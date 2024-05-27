/**
 Implementiere ein Programm, das auf der Konsole ein großes X aus dem
 Zeichen X ausgibt, abhängig von der Variablen int size (size = 3, 4, ..., 10):
 size = 3:     size = 4:      size = 5:      etc.
   X X          X  X           X   X
    X            XX             X X
   X X           XX              X
                X  X            X X
                               X   X
 */

class Schleife02 {
  public static void main( String[] str ) {
    int size = 10;
    for ( byte zeile = 1; zeile <= size; zeile++ ) {
      for ( byte spalte = 1; spalte < size+1; spalte++ ) {
         if ( (zeile == spalte) || (zeile + spalte == size+1)) {
           System.out.print("X");
         } else {
           System.out.print(" ");
         }
      }
      System.out.println();
    }
  }
}
