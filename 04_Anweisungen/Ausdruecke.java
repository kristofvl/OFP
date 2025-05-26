
class Ausdruecke {
 public static void main(String[] s) {
  int x, y, produkt;
  boolean b;
  x = 2;  produkt = 1;

  y = x * 7 / 2;            // y = ?
  System.out.println("y = " + y);

  b = ( (x + y) >= 13 );    // b = ?
  System.out.println("b = " + b);

  x += -5;                  // x = ?
  System.out.println("x = " + x);

  y = y | 8;                // y = ?
  System.out.println("y = " + y);

  produkt *= x - y;         // produkt = ?
  System.out.println("produkt = " + produkt);

  b = produkt != 3117;      // b = ?
  System.out.println("b = " + b);
 }
}
