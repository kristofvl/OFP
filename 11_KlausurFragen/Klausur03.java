/** Finde die 2 Compiler-Fehler:
    */

class Klausur03 {
  public static void main(String[] str) {
    boolean wot = ! false;
    if (wot) {
      char symbol1 = '@', symbol2 = '!';
      String returnStr;
      if (symbol1 > 0) {
        String str = " " + symbol1 + symbol2;
        str += symbol1;
	 }
	 short returnShort = (short)symbol2;
	 wot = (boolean) symbol2;
    }
  }
}
