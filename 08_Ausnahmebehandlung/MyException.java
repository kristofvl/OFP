public class MyException extends Exception {
  private int elNr = -1;
  public MyException() {}                    // diese beiden Konstruktoren
  public MyException(String s) { super(s); } // werden immer definiert
  // extra Konstruktor mit Zusatzinformation zum Fehler:
  public MyException(String s, int elNr) { super(s); this.elNr = elNr; }
  public int getElementNr() { return elNr; }
  public String toString() {
    // getMessage() ist Methode der Oberklasse Throwable, liefert den String
    // zurueck, der dem Konstruktor uebergeben wurde:
    return "Eigener Fehler im Element " + elNr + ": " + getMessage();
  }
  public static void main(String[] s) {
    try {
      throw new MyException("Testfehler.", 9);  // Werfe Fehler
    }
    catch (MyException e) {
      System.out.println(e.toString());
    }
  }
}
