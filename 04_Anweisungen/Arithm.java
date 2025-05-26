
class Arithm {
 public static void main(String[] s) {
  int x, y, breite, laenge, produkt, rest, quotient;

  x = 2; y = 3; laenge = 7;

  breite   = x + y;             // Addition
  System.out.println("breite = " + breite);

  laenge   = laenge - 1;        // Subtraktion
  System.out.println("laenge = " + laenge);

  produkt  = x * y;             // Multiplikation
  System.out.println("produkt = " + produkt);

  quotient = x / y;             // Division
  System.out.println("quotient = " + quotient);

  rest     = x % y;             // Modulo (Restoperation)
  System.out.println("rest = " + rest);

  x++;				           // Inkrement: x = x + 1
  System.out.println("x = " + x);

  x--;				           // Dekrement: x = x - 1
  System.out.println("x = " + x);

  laenge = 4 * (x + y);         // Klammerung
  System.out.println("laenge = " + laenge);

  laenge = breite = 1;          // Eine Zuweisung ist wieder ein Ausdruck
  System.out.println("laenge = " + laenge + ", breite = " + breite);

  produkt = (x = 2) * (y = 5);  // Möglich, aber schlechter Stil
  System.out.println("produkt = " + produkt);
 }
}
