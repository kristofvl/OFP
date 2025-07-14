/** 1. In welchen 3 Zeilen befinden sich Compiler-Fehler?
    2. Was gibt dieses Programm aus, wenn die Zeilen gelöscht werden?
 */
class Klausur04 {
  public static void main(String[] s) {
    double a, b = 1.2;
    char c = 'a';
    System.out.println("abracadabr"+c);
    int d = 3, e = 8;
    final boolean f = false;
    a = (d > 1) ? 4.5 : 6.7;
    b = c + a * d;
    d = d + a;
    f = (e <= 8);
    d = (int)a + (int)c;
    e = (int)(a == b);
  }
}
