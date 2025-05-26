/**
 Der Typ eines Ausdrucks kann (in Grenzen) angepaßt werden:
 Explizite Typkonversion versus implizite (automatische) Typkonversion
 */

class Typkonversionen {
  public static void main(String[] s) {
    double x, y = 1.1;
    int i, j = 5;
    char c = 'a';
    boolean b = true;
    x = 3;         // OK: x == 3.0
    x = 3/4;       // x == 0.0
    x = c + y * j; // OK, Konversion nach double
    i = j + x;     // Fehler: (j + x) hat Typ double
    i = (int)x; 	  // OK, i = ganzzahl. Anteil von x
    i = (int)b;    // Fehler: keine Konversion von boolean
    b = i;         // Fehler: keine Konversion zu boolean
    b = (i != 0);  // OK, Vergleich liefert boolean
    c = c + 1;     // Fehler: c + 1 hat Typ int
    c += 1;        // OK! c == ’b’
  }
}
