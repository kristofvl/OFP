
class Arithm {
 public static void main(String[] s) {
  int x, y, z;

  x = 1; y = 2; z = 3;
  System.out.println(" x = " + x + ", y = " + y + ", z = " + z);

  x = y & z;            // UND
  System.out.println(" y & z = " + x);

  x = y | z;            // ODER
  System.out.println(" y | z = " + x);

  x = y ^ z;            // Exklusives ODER
  System.out.println(" y ^ z = " + x);

  x = ~ y;              // Komplement
  System.out.println(" ~y = " + x);

  x = y << 1;           // Linksschieben (x = y * 2)
  System.out.println(" y << 1 = " + x);

  x = y >> 1;           // Rechtsschieben (schiebt Vorzeichen nach)
  System.out.println(" y >> 1 = " + x);

  x = y >>> 4;          // Rechtsschieben (schiebt 0 nach)
  System.out.println(" y >>> 4 = " + x);

  x = x | 010;          // Setzt Bit 3 in x (010 == 8, Oktalzahl)
  System.out.println(" x | 010 = " + x);

  y = (x & 0xF0) >> 4;  // y = Bits 7..4 von x (0xF0 == 240, Hexadezimal)
  System.out.println(" x & 0x0F = " + y);

 }
}
